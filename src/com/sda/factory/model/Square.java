package com.sda.factory.model;

import com.sda.factory.Shape;

/**
 * Created by arczi on 3/29/17.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("DrawS");
    }

    @Override
    public void fill() {
        System.out.println("FillS");
    }

    @Override
    public void size() {
        System.out.println("SizeS");
    }
}
