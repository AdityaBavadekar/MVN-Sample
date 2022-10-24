package io.github.adityabavadekar.mvn_sample;

import androidx.annotation.NonNull;

public enum LibraryType {
    RELEASE, DEBUG, TESTING;

    @NonNull
    @Override
    public String toString() {
        return TAG + "[" + super.name() + "]";
    }

    private static final String TAG = "LibraryType";

}
