package com.example.wanandroidjetpack.ui.main

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.wanandroidjetpack.R
import com.example.wanandroidjetpack.base.BaseFragment
import com.example.wanandroidjetpack.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initFragment(view: View, savedInstanceState: Bundle?) {
        mBinding.tv.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mainFragment)
        }
    }
}