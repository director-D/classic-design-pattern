package com.mountaintop.designpattern.Interpreter;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 16:01
 * @Version: 1.0
 * @Description:
 */
public class Num implements Expression{

    private int number;

    public Num(int number){
        this.number = number;
    }




    @Override
    public int interpret() {
        return number;
    }
}
