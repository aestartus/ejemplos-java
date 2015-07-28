package com.test.creational_patterns.example_patternabstractfactory.model.shape;

/**
 * Created by nhakor on 24-07-15.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
