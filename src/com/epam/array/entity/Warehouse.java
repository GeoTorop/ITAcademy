package com.epam.array.entity;

import com.epam.array.entity.CustomArrayStat;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Warehouse {
    private static Warehouse instance;

    private Map<UUID, CustomArrayStat> mapWithArrayCharacteristics;

    private Warehouse() {
        mapWithArrayCharacteristics = new ConcurrentHashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            synchronized (Warehouse.class) {
                if (instance == null) {
                    instance = new Warehouse();
                }
            }
        }
        return instance;
    }

    public CustomArrayStat put(UUID key, CustomArrayStat value) {
        return mapWithArrayCharacteristics.put(key, value);
    }

    public CustomArrayStat remove(UUID key) {
        return mapWithArrayCharacteristics.remove(key);
    }

    public CustomArrayStat replace(UUID key, CustomArrayStat value) {
        return mapWithArrayCharacteristics.replace(key, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Warehouse{");
        sb.append("mapWithArrayCharacteristics=").append(mapWithArrayCharacteristics);
        sb.append('}');
        return sb.toString();
    }
}
