package com.example.wanandroidjetpack.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

abstract  class BaseFragment<VB : ViewDataBinding> : Fragment(),CoroutineScope by MainScope() {


    protected lateinit var mBinding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding=DataBindingUtil.inflate(inflater,getLayoutId(),container,false)

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("abc","onViewCreated:"+BaseFragment@this::class.java.simpleName)
        mBinding.lifecycleOwner=this
        initFragment(view,savedInstanceState)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("abc","onDestroyView:"+BaseFragment@this::class.java.simpleName)
    }



    abstract fun getLayoutId():Int
    abstract fun initFragment(view: View, savedInstanceState: Bundle?)
}