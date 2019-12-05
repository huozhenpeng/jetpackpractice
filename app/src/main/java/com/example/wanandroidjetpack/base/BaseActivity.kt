package com.example.wanandroidjetpack.base

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

/**
 * 我们通过ViewModel来配置页面的数据，所以每个页面都需要ViewModel
 */
abstract class BaseActivity<VB : ViewDataBinding> :AppCompatActivity(),CoroutineScope by MainScope(){


     protected val mBinding : VB by lazy {
        DataBindingUtil.setContentView(this,getLayouId()) as VB
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(needTransparentStatus())
        {
            transparentStatusBar()
        }
        mBinding.lifecycleOwner=this
        initActivity(savedInstanceState)

    }

    override fun onStop() {
        super.onStop()
        cancel()
        mBinding.unbind()
    }

    protected open fun needTransparentStatus():Boolean=false

    /** 透明状态栏 */
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    open fun transparentStatusBar() {
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window.navigationBarColor = Color.TRANSPARENT
        window.statusBarColor = Color.TRANSPARENT
        supportActionBar?.hide()
    }


    abstract fun getLayouId():Int
    abstract fun initActivity(savedInstanceState: Bundle?)

}