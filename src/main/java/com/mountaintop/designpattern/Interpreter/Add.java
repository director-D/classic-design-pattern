package com.mountaintop.designpattern.Interpreter;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 16:02
 * @Version: 1.0
 * @Description:
 */
public class Add implements Expression{

    private Expression left , right ;

    public Add(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }

}
