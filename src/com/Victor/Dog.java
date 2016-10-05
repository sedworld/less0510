package com.Victor;

/**
 * Created by Victor on 05.10.2016.
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("omnonom");
    }

    @Override
    public void voice() {
        System.out.println("gav-gav");
    }
}
