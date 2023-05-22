package com.epam.array.observer.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.entity.CustomArrayStat;
import com.epam.array.entity.Warehouse;
import com.epam.array.observer.CustomObserver;
import com.epam.array.observer.Event;
import com.epam.array.service.ArrayCalculationService;
import com.epam.array.service.impl.ArrayCalculationServiceImpl;

import java.util.UUID;

public class CustomObserverImpl implements CustomObserver {
    private static final ArrayCalculationService calcService = new ArrayCalculationServiceImpl();

    @Override
    public void parameterChanged(Event arrayEvent){
        System.out.println("parameterChanged called for " + arrayEvent );
        CustomArray array = arrayEvent.getSource();
        Integer min = calcService.findMin(array);
        Integer max = calcService.findMax(array);
        Integer sum = calcService.findSum(array);
        Double avg = calcService.findAvg(array);
        Integer countPositive = calcService.countPositive(array);
        Integer countNegative = calcService.countNegative(array);
        CustomArrayStat statistics = new CustomArrayStat(min, max, sum, avg, countPositive, countNegative);

        UUID id = array.getId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
