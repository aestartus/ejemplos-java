package com.test.example_enum;

/**
 * Created by nhakor on 22-07-15.
 */
class FreshJuice {

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;

    enum FreshJuiceFlavor{ APPLE, BANANA, ORANGE }
    FreshJuiceFlavor flavor;
}


public class FreshJuiceTest{
    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();

        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);

        juice.flavor = FreshJuice.FreshJuiceFlavor.APPLE;
        System.out.println("Flavor: " + juice.flavor);
    }
}

