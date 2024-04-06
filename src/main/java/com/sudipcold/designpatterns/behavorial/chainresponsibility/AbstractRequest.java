package com.sudipcold.designpatterns.behavorial.chainresponsibility;

public abstract class AbstractRequest {
    // Each request is identified by a an integer
    // FireRequest: 1
    // LowFuelRequest: 2
    private final int requestCode;

    public AbstractRequest(int requestCode) {
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
