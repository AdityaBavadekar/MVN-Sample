package com.adityaamolbavadekar.mvn_sample.kotlin

import android.util.Log
import com.adityaamolbavadekar.mvn_sample.BuildConfig
import com.adityaamolbavadekar.mvn_sample.InstanceId

class MVNSampleKotlinClass private constructor(instanceId: InstanceId, version: String) {
    companion object {

        fun sayHello(): String {
            return "Hello"
        }

        val instance: MVNSampleKotlinClass
            get() = MVNSampleKotlinClass(InstanceId.getInstance(), BuildConfig.VERSION_NAME)
        const val MVNSampleKotlinClass_TAG = "MVNSampleKotlinClass"
        const val LIBRARY_NAME = "MVN-Sample"
        const val DEVELOPER_NAME = "Aditya Bavadekar"

    }

    init {
        Log.d(
            MVNSampleKotlinClass_TAG,
            "Version[" + version + "] >> newInstance : " + instanceId.id
        )
    }
}
