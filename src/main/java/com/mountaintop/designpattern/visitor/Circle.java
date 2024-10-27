package com.mountaintop.designpattern.visitor;

import com.mountaintop.designpattern.visitor.stragegy.Calculator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:37
 * @Version: 1.0
 * @Description:
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double accept(Calculator calculator) {
        return calculator.ofShape(this);
    }
}
