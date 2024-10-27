package com.mountaintop.designpattern.command.impl;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:25
 * @Version: 1.0
 * @Description:
 */
public class ShapeDrawer {


    public void drawShape(String shape) {
        System.out.println("ShapeDrawer#drawShape 画了一个 " + shape);
    }

    public void undrawShape() {
        System.out.println("ShapeDrawer#drawShape 撤销了一个 ");
    }
}
