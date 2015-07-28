package com.test.creational_patterns.example_patternabstractfactory.factory;

import com.test.creational_patterns.example_patternabstractfactory.model.color.Color;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Shape;

/**
 * Created by nhakor on 24-07-15.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
