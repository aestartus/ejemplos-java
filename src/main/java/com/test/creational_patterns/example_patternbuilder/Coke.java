package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
