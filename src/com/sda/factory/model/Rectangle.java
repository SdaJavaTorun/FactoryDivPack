package com.sda.factory.model;

import com.sda.factory.Shape;

/**
 * Created by arczi on 3/29/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("DrawR");
    }

    @Override
    public void fill() {
        System.out.println("FillR");
    }

    @Override
    public void size() {
        System.out.println("SizeR");
    }
}
