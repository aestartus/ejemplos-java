package com.test.creational_patterns.example_patternabstractfactory.model.color;

/**
 * Created by nhakor on 24-07-15.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
