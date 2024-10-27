package com.mountaintop.designpattern.visitor;

import com.mountaintop.designpattern.visitor.stragegy.Calculator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 10:33
 * @Version: 1.0
 * @Description:
 */
public interface Shape {

//    double getPerimeter();

    double accept(Calculator calculator);


}
