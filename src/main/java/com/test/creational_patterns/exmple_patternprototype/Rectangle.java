package com.test.creational_patterns.exmple_patternprototype;

/**
 * Created by nhakor on 27-07-15.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
