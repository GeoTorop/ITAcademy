package com.epam.array.observer;

public interface Observable {
    void attach(CustomObserver observer);
    void detach(CustomObserver observer);
    void notifyObserver();
}
