package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
