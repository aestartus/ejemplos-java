package com.test.creational_patterns.example_patternabstractfactory.factory;

import com.test.creational_patterns.example_patternabstractfactory.model.color.Color;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Circle;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Rectangle;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Shape;
import com.test.creational_patterns.example_patternabstractfactory.model.shape.Square;

/**
 * Created by nhakor on 24-07-15.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
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

    @Override
    public Color getColor(String color) {
        return null;
    }
}
