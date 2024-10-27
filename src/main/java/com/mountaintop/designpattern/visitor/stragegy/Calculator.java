package com.mountaintop.designpattern.visitor.stragegy;

import com.mountaintop.designpattern.visitor.Circle;
import com.mountaintop.designpattern.visitor.Rectangle;
import com.mountaintop.designpattern.visitor.Triangle;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:42
 * @Version: 1.0
 * @Description:
 */
public interface Calculator {

    double ofShape(Triangle triangle);

    double ofShape(Circle circle);


    double ofShape(Rectangle circle);

}
