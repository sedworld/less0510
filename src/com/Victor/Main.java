package com.Victor;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Animal pet;
        pet = new Dog();
        pet.voice();

        new Animal(){
            @Override
            public void eat() {

            }

            @Override
            public void voice() {
                System.out.println("WatchDog!");
            }
        }.voice();




    }

}



