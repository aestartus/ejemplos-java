package com.test.creational_patterns.exmple_patternprototype;

/**
 * Created by nhakor on 27-07-15.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
