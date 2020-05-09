package com.darshan.databinding

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListerner: AuthListerner? = null

    fun onLoginButtonClick(view: View) {

        authListerner?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListerner?.onFailure("Invalid email or password")
            return
        }
        authListerner?.onSuccess()

        //Success for some time
    }

}