package com.test.creational_patterns.example_patternbuilder;

/**
 * Created by nhakor on 27-07-15.
 */
public class BuilderPatternDemo {

    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.print("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal nonVegaMeal = mealBuilder.prepareNonVegMeal();
        System.out.print("\n\nNon-Veg Meal");
        nonVegaMeal.showItems();
        System.out.println("Total Cost : " + nonVegaMeal.getCost());
    }
}
