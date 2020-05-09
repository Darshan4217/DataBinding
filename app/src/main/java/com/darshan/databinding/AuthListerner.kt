package com.darshan.databinding

interface AuthListerner {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}