package com.epam.array.repository;

import com.epam.array.entity.CustomArray;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Repository {
    private static Repository instance;

    private List<CustomArray> customArrays = new ArrayList<>();

    public Repository(){}

    public static Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("dataArrays=" + customArrays)
                .toString();
    }

    public boolean add(CustomArray customArray) {
        return customArrays.add(customArray);
    }

    public boolean addAll(List<CustomArray> customArrays) {
        return this.customArrays.addAll(customArrays);
    }

    public boolean delete(CustomArray customArray) {
        return customArrays.remove(customArray);
    }

    public boolean deleteAll(List<CustomArray> customArrays) {
        return this.customArrays.removeAll(customArrays);
    }

    public void sortArrayByFirstElement() {
        customArrays.sort(Comparator.comparingInt(o -> o.getArray()[0]));
    }

    public void sortArrayByLength() {
        customArrays.sort(Comparator.comparingInt(o -> o.getArray().length));
    }

    public CustomArray query(Specification specification) {
        return customArrays.stream().filter(specification::specify).findFirst().orElse(null);
    }
}
