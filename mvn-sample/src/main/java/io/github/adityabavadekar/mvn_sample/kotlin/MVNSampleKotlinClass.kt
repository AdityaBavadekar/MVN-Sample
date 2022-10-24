package io.github.adityabavadekar.mvn_sample.kotlin

import android.util.Log
import com.adityaamolbavadekar.mvn_sample.BuildConfig
import io.github.adityabavadekar.mvn_sample.InstanceId
import io.github.adityabavadekar.mvn_sample.MVNSample

class MVNSampleKotlinClass private constructor(instanceId: InstanceId, version: String) :
    MVNSample {

    override fun sayHello(): String {
        return "Hello"
    }

    companion object {

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
