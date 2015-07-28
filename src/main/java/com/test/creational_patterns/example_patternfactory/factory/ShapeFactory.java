package com.test.creational_patterns.example_patternfactory.factory;

import com.test.creational_patterns.example_patternfactory.model.Circle;
import com.test.creational_patterns.example_patternfactory.model.Rectangle;
import com.test.creational_patterns.example_patternfactory.model.Shape;
import com.test.creational_patterns.example_patternfactory.model.Square;

/**
 * Created by nhakor on 24-07-15.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
