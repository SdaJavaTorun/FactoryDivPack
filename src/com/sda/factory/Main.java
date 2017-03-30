package com.sda.factory;

import com.sda.factory.control.ShapeProcess;

public class Main {

    public static void main(String[] args) {

        //Factory f = new Factory();
        //ShapeProcess sp = new ShapeProcess(new Factory());
        ShapeProcess sp = new ShapeProcess();

        sp.doAction("circle");
        sp.doAction("square");
    }
}
