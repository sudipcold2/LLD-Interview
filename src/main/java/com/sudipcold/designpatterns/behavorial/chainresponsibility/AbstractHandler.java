package com.sudipcold.designpatterns.behavorial.chainresponsibility;

public abstract class AbstractHandler {
    private AbstractHandler next;

    public AbstractHandler(AbstractHandler next) {
        this.next = next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public void handleRequest(AbstractRequest request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
