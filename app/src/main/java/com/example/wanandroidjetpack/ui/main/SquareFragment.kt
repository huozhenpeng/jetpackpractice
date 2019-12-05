package com.example.wanandroidjetpack.ui.main

import android.os.Bundle
import android.view.View
import com.example.wanandroidjetpack.R
import com.example.wanandroidjetpack.base.BaseFragment
import com.example.wanandroidjetpack.databinding.FragmentSquareBinding

class SquareFragment : BaseFragment<FragmentSquareBinding>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_square
    }

    override fun initFragment(view: View, savedInstanceState: Bundle?) {

    }
}