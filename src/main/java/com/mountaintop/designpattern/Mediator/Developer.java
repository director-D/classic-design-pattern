package com.mountaintop.designpattern.Mediator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 15:53
 * @Version: 1.0
 * @Description:
 */
public class Developer extends TeamMember{
    public Developer(String name) {
        super(name);
        this.role = TeamMember.RD;
    }

    public void dailyWork() {
        System.out.println("我是一个码农，我经常加班写代码，困了累了可能写出bug来。");
    }
}
