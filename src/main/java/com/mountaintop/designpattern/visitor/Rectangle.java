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
public class Rectangle implements Shape{


    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }


    @Override
    public double accept(Calculator calculator) {
        return calculator.ofShape(this);
    }
}
