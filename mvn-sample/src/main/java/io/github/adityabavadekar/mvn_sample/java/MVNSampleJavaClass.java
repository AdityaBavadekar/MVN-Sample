package io.github.adityabavadekar.mvn_sample.java;

import android.util.Log;
import io.github.adityaamolbavadekar.mvn_sample.BuildConfig;
import io.github.adityabavadekar.mvn_sample.InstanceId;
import io.github.adityabavadekar.mvn_sample.MVNSample;

public class MVNSampleJavaClass implements MVNSample {

    private MVNSampleJavaClass(InstanceId instanceId, String version) {
        Log.d(MVNSampleJavaClass_TAG, "Version[" + version + "] >> newInstance : " + instanceId.getId());
    }

    public String sayHello() {
        return "Hello";
    }

    public static MVNSampleJavaClass getInstance() {
        return new MVNSampleJavaClass(InstanceId.getInstance(), BuildConfig.VERSION_NAME);
    }

    public static final String MVNSampleJavaClass_TAG = "MVNSampleJavaClass";
    public static final String LIBRARY_NAME = "MVN-Sample";
    public static final String DEVELOPER_NAME = "Aditya Bavadekar";

}
