package com.adityaamolbavadekar.mvn_sample_app

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.adityaamolbavadekar.mvn_sample.MVNSampleJavaClass

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, MVNSampleJavaClass.instance().sayHello(), Toast.LENGTH_SHORT).show()
    }

}