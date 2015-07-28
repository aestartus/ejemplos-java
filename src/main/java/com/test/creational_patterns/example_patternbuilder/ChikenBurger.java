package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public class ChikenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
