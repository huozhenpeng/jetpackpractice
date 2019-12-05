package com.example.wanandroidjetpack.ui

import android.content.Intent
import android.os.Bundle
import com.example.wanandroidjetpack.MainActivity
import com.example.wanandroidjetpack.R
import com.example.wanandroidjetpack.base.BaseActivity
import com.example.wanandroidjetpack.base.delayLaunch
import com.example.wanandroidjetpack.databinding.ActivitySplanshBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

class SplanshActivity : BaseActivity<ActivitySplanshBinding>(){
    override fun getLayouId(): Int {
        return R.layout.activity_splansh
    }

    override fun initActivity(savedInstanceState: Bundle?) {

        delayLaunch(2000,context = Dispatchers.Main)
        {
            startActivity(Intent(this@SplanshActivity,MainActivity::class.java))
            finish()
        }

    }

    override fun needTransparentStatus(): Boolean {
        return true

    }
}