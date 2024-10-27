package com.mountaintop.designpattern.Interpreter;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 17:11
 * @Version: 1.0
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        // 解析 2+3-4/2 的值
        Expression a = new Num(2), b = new Num(3),
                c = new Num(4), d = new Num(2);

        Expression result = new Sub(new Add(a, b), new Div(c, d));

        System.out.println(result.interpret());
    }

}
