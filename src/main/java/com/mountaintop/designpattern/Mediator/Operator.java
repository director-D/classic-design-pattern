package com.mountaintop.designpattern.Mediator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 15:54
 * @Version: 1.0
 * @Description:
 */
public class Operator extends TeamMember {

    public Operator(String name) {
        super(name);
        this.role = TeamMember.OP;
    }

    public void dailyWork() {
        System.out.println("我是一个运维，保证系统稳定运行，如果有线上bug及时回滚，话说开发人员写的程序真不稳定。");
    }

}
