package com.test.example_inheritance;

/**
 * Created by nhakor on 22-07-15.
 */
interface Animal{}

class Mammal implements Animal{}

public class DogWeird extends Mammal {
    public static void main(String args[]){

        Mammal m = new Mammal();
        DogWeird d = new DogWeird();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
