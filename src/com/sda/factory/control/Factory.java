package com.sda.factory.control;

import com.sda.factory.Shape;
import com.sda.factory.model.Circle;
import com.sda.factory.model.Rectangle;
import com.sda.factory.model.Square;

public class Factory {

    //public Shape getShape(String type) {
    public static Shape getShape(String type) {

        Shape obj = null;

        if (type.equals("circle")) {
            obj = new Circle();
        }
        else if (type.equals("square")) {
            obj = new Square();
        }
        else
            obj = new Rectangle();

        return obj;
    }

}
