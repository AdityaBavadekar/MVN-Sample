package com.adityaamolbavadekar.mvn_sample.logger;

public class Log {

    private String mTAG = null;

    private Log(String mTAG) {
        this.mTAG = mTAG;
    }

    public String getTAG() {
        return mTAG;
    }

    public static Log TAG(String className) {
        return new Log(className);
    }

    public void d(String message) {
        log(Type.DEBUG.join(message));
    }

    public void e(String message) {
        log(Type.ERROR.join(message));
    }

    public void w(String message) {
        log(Type.WARN.join(message));
    }

    public void i(String message) {
        log(Type.INFO.join(message));
    }

    private void log(String message) {
        android.util.Log.println(android.util.Log.DEBUG, TAG, message);
    }

    private enum Type {
        DEBUG, ERROR, WARN, INFO;

        public String join(String message) {
            return super.name() + "[" + message + "]";
        }
    }

    private static final String TAG = "Log";

}
