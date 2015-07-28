package com.test.creational_patterns.example_patternabstractfactory.factory;

import com.test.creational_patterns.example_patternabstractfactory.model.color.Blue;
import com.test.creational_patterns.example_patternabstractfactory.model.color.Color;
import com.test.creational_patterns.example_patternabstractfactory.model.color.Green;
import com.test.creational_patterns.example_patternabstractfactory.model.color.Red;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Shape;

/**
 * Created by nhakor on 24-07-15.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
