package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
