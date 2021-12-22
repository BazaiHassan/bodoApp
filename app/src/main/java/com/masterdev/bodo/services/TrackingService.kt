package com.masterdev.bodo.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.masterdev.bodo.utils.Constants.ACTION_PAUSE_SERVICE
import com.masterdev.bodo.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.masterdev.bodo.utils.Constants.ACTION_STOP_SERVICE

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action){
                ACTION_START_OR_RESUME_SERVICE -> {
                    //TODO
                }

                ACTION_PAUSE_SERVICE -> {

                }

                ACTION_PAUSE_SERVICE -> {

                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}