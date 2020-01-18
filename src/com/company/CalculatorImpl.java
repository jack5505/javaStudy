package com.company;

import java.util.HashMap;
import java.util.Map;

public class CalculatorImpl implements Calculator {

    private final Map<String,Integer> cashes = new HashMap<>();

    @Override
    public int run(String temp) {
        //Write into temp if this key is existed
        //Otherwise will work second function and return result
        return cashes.computeIfAbsent(temp,this::doRun);
    }

    private int doRun(String temp) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return temp.hashCode();
    }
}
