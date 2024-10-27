package com.mountaintop.designpattern.command.impl;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:27
 * @Version: 1.0
 * @Description:
 */
public class ColorFiller {


    public void fillColor(String color) {
        System.out.println("填充" + color);
    }

    public void undoFillColor() {
        System.out.println("撤销填充的颜色");
    }
}
