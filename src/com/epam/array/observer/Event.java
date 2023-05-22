package com.epam.array.observer;

import com.epam.array.entity.CustomArray;

import java.util.EventObject;

public class Event extends EventObject {
    public Event(CustomArray customArray) {
        super(customArray);
    }

    @Override
    public CustomArray getSource(){
        return (CustomArray) super.getSource();
    }
}
