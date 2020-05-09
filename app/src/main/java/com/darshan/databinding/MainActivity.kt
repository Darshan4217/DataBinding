package com.darshan.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.darshan.databinding.databinding.ActivityMainBinding
import com.darshan.databinding.util.toast

class MainActivity : AppCompatActivity(), AuthListerner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        val dataBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        //ActivityMainBinding is created automatically and name is created depending on your xml file name.

        //Gettting view model

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        //Set our view model to bindinig view model

        dataBinding.viewModel = viewModel

        viewModel.authListerner = this

    }

    //How to get call back from view model to view create interface.

    //Get view model. We need to bind view model to activity

    override fun onStarted() {
        toast("started")
    }

    override fun onSuccess() {
        toast("success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }


}
