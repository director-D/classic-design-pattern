package com.mountaintop.designpattern.visitor.stragegy;

import com.mountaintop.designpattern.visitor.Circle;
import com.mountaintop.designpattern.visitor.Rectangle;
import com.mountaintop.designpattern.visitor.Triangle;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:48
 * @Version: 1.0
 * @Description:
 */
public class Area implements Calculator{

    @Override
    public double ofShape(Triangle triangle) {
        double a = triangle.getEdgeA(), b = triangle.getEdgeB(), c = triangle.getEdgeC();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) *  (p - b) * (p - c));
    }


    @Override
    public double ofShape(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double ofShape(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getLength();
    }
}
