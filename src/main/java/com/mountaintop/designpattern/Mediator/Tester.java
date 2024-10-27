package com.mountaintop.designpattern.Mediator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 15:53
 * @Version: 1.0
 * @Description:
 */
public class Tester extends TeamMember {

    public Tester(String name) {
        super(name);
        this.role = TeamMember.QA;
    }

    public void dailyWork() {
        System.out.println("我是一名测试，我找出bug，确保代码质量。");
    }

}
