package com.adityaamolbavadekar.mvn_sample_app

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import io.github.adityabavadekar.mvn_sample.InstanceId
import io.github.adityabavadekar.mvn_sample.MVNSample
import io.github.adityabavadekar.mvn_sample.java.MVNSampleJavaClass
import io.github.adityabavadekar.mvn_sample.kotlin.MVNSampleKotlinClass
import io.github.adityabavadekar.mvn_sample.logger.Log

class MainActivity : Activity() {

    private val logger = Log.TAG(javaClass.simpleName)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, MVNSampleJavaClass.getInstance().sayHello(), Toast.LENGTH_SHORT).show()
        logger.d("Hi")
        logger.d("Hello")
        logger.d("MVN-Sample App")
        MVNSample {
            "String"
        }
        InstanceId.getInstance().id
        MVNSampleKotlinClass.instance.sayHello()
    }

}