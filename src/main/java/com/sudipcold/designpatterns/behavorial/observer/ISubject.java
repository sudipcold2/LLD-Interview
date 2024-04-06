package com.sudipcold.designpatterns.behavorial.observer;

public interface ISubject {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
