package com.example.daggerhiltproject.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltproject.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository // FIELD INJECTION

    override fun onCreate() {
        super.onCreate()
        //repository available, injection already done
        //repository.doNetworkCall()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}