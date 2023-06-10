package com.epam.xml.builder;

import com.epam.xml.entity.Flower;

import java.util.Set;

public interface FlowersBuilder {
    void buildSetFlowers(String fileName); //filename also correct?
    Set<Flower> getFlowers();
}
