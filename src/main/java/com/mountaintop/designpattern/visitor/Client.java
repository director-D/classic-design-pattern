package com.mountaintop.designpattern.visitor;

import com.mountaintop.designpattern.visitor.stragegy.Area;
import com.mountaintop.designpattern.visitor.stragegy.Perimeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:38
 * @Version: 1.0
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
        test_visitor_pattern();
    }


    public static void test_visitor_pattern(){
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle(1.3, 2.2, 3.1));
        shapes.add(new Circle(1.2));
        shapes.add(new Triangle(2.4, 3.3, 4.2));
        shapes.add(new Rectangle(2.1, 3.2));
        shapes.add(new Circle(5.6));

        Perimeter perimeter = new Perimeter();
        Area area = new Area();

        for (Shape shape : shapes) {
            System.out.printf("周长 ： %5.2f , 面积 ： %5.2f \n" , shape.accept(perimeter),shape.accept(area));
            System.out.printf("周长 ： %5.2f \n" , shape.accept(perimeter));
        }

    }

    public static void test_1() {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle(1.3, 2.2, 3.1));
        shapes.add(new Circle(1.2));
        shapes.add(new Triangle(2.4, 3.3, 4.2));
        shapes.add(new Rectangle(2.1, 3.2));
        shapes.add(new Circle(5.6));

        for (Shape shape : shapes) {
//            System.out.println(shape.getPerimeter());
        }

    }


}
