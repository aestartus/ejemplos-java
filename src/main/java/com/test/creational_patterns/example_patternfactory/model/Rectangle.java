package com.test.creational_patterns.example_patternfactory.model;

/**
 * Created by nhakor on 24-07-15.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
