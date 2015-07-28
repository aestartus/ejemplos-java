package com.test.creational_patterns.exmple_patternprototype;

/**
 * Created by nhakor on 27-07-15.
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
