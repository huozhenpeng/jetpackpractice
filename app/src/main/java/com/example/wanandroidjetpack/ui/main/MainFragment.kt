package com.example.wanandroidjetpack.ui.main

import android.os.Bundle
import android.view.View
import com.example.wanandroidjetpack.R
import com.example.wanandroidjetpack.base.BaseFragment
import com.example.wanandroidjetpack.databinding.FragmentMainBinding

class MainFragment :BaseFragment<FragmentMainBinding>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun initFragment(view: View, savedInstanceState: Bundle?) {

    }

}