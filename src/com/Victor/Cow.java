package com.Victor;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Victor on 05.10.2016.
 */
public class Cow extends Animal {

    @Override
    public void eat() {
        System.out.println("hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Mooo");
    }
}
