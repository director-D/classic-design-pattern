package com.mountaintop.designpattern.visitor;

import com.mountaintop.designpattern.visitor.stragegy.Calculator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:36
 * @Version: 1.0
 * @Description:
 */
public class Triangle implements Shape{

    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }

    @Override
    public double accept(Calculator calculator) {
        return calculator.ofShape(this);
    }
}
