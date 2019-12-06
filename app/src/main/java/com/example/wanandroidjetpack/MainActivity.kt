package com.example.wanandroidjetpack

import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.example.wanandroidjetpack.base.BaseActivity
import com.example.wanandroidjetpack.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getLayouId(): Int {
        return R.layout.activity_main
    }

    override fun initActivity(savedInstanceState: Bundle?) {

        mBinding.navigationView.setupWithNavController(Navigation.findNavController(this,R.id.nav_host_fragment))

        //记得menu中item的id和navigation.xml中fragment的id要相同，要不然无法跳转
        mBinding.navigationView.setOnNavigationItemSelectedListener {
            item->
            onNavDestinationSelected(item, Navigation.findNavController(this, R.id.nav_host_fragment))
        }

    }



}
