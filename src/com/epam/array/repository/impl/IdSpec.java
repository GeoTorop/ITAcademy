package com.epam.array.repository.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.Specification;

import java.util.UUID;

public class IdSpec implements Specification {
    private UUID id;

    public IdSpec(UUID id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArray.getId().equals(id);
        return result;
    }
}
