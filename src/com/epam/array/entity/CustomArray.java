package com.epam.array.entity;

import com.epam.array.exception.CustomException;
import com.epam.array.observer.CustomObserver;
import com.epam.array.observer.Event;
import com.epam.array.observer.Observable;
import com.epam.array.observer.impl.CustomObserverImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.UUID;

public class CustomArray implements Observable {
    private int prime = 31;
    private UUID id;
    private int[] array;
    private CustomObserver observer;

    public CustomArray() {
        this.id = UUID.randomUUID();
        this.array = new int[]{};
        observer = null;
    }

    public CustomArray(int[] array) {
        this.id = UUID.randomUUID();
        if (array != null) {
            observer = new CustomObserverImpl();
            setArray(array);
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObserver();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("id=").append(id);
        sb.append(", array=").append(Arrays.toString(array));
        sb.append(", observer=").append(observer);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray customArray = (CustomArray) o;
        return Arrays.equals(array, customArray.array);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = prime * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public void attach(CustomObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach(CustomObserver observer) {
        if (this.observer.equals(observer)) {
            this.observer = null;
        }
    }

    @Override
    public void notifyObserver() {
        if (observer != null) {
            Event event = new Event(this);
            observer.parameterChanged(event);
        }
    }
}

