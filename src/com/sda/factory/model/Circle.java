package com.sda.factory.model;

import com.sda.factory.Shape;

/**
 * Created by arczi on 3/29/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("DrawC");
    }

    @Override
    public void fill() {
        System.out.println("FillC");
    }

    @Override
    public void size() {
        System.out.println("SizeC");
    }
}
