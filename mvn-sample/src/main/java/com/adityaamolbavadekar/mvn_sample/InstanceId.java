package com.adityaamolbavadekar.mvn_sample;

import java.util.UUID;

public class InstanceId {

    private String id = null;

    private InstanceId(UUID id) {
        this.id = id.toString();
    }

    public String getId() {
        if (id == null) throw new NullPointerException("Id was requested but was null");
        return id;
    }

    public static InstanceId getInstance() {
        return new InstanceId(UUID.randomUUID());
    }

}
