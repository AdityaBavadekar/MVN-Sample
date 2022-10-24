package com.adityaamolbavadekar.mvn_sample.java;

import android.util.Log;

import com.adityaamolbavadekar.mvn_sample.BuildConfig;
import com.adityaamolbavadekar.mvn_sample.InstanceId;

public class MVNSampleJavaClass {

    private MVNSampleJavaClass(InstanceId instanceId, String version) {
        Log.d(MVNSampleJavaClass_TAG, "Version[" + version + "] >> newInstance : " + instanceId.getId());
    }

    public static String sayHello() {
        return "Hello";
    }

    public static MVNSampleJavaClass getInstance() {
        return new MVNSampleJavaClass(InstanceId.getInstance(), BuildConfig.VERSION_NAME);
    }

    public static final String MVNSampleJavaClass_TAG = "MVNSampleJavaClass";
    public static final String LIBRARY_NAME = "MVN-Sample";
    public static final String DEVELOPER_NAME = "Aditya Bavadekar";

}
