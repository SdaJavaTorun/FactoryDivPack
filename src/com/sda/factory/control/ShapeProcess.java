package com.sda.factory.control;

import com.sda.factory.Shape;

public class ShapeProcess {

   // private Factory factory;

    //public ShapeProcess(){
      //  this.factory = factory;
    //}

    public void doAction(String type) {
        Shape shape = Factory.getShape(type);
        shape.draw();
        shape.fill();
        shape.size();

    }
}
