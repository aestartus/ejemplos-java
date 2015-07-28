package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
