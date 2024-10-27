package com.mountaintop.designpattern.visitor.stragegy;

import com.mountaintop.designpattern.visitor.Circle;
import com.mountaintop.designpattern.visitor.Rectangle;
import com.mountaintop.designpattern.visitor.Triangle;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:44
 * @Version: 1.0
 * @Description:
 */
public class Perimeter implements Calculator {
    @Override
    public double ofShape(Triangle triangle) {
        return triangle.getEdgeA() + triangle.getEdgeB() + triangle.getEdgeC();
    }

    @Override
    public double ofShape(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    @Override
    public double ofShape(Rectangle rectangle) {
        return (rectangle.getLength() + rectangle.getWidth()) * 2;
    }
}
