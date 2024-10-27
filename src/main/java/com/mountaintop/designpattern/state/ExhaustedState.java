package com.mountaintop.designpattern.state;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 14:26
 * @Version: 1.0
 * @Description:
 */
public class ExhaustedState implements State{
    @Override
    public void coding() {
        System.out.println("加班熬夜码代码，专业写bug");
    }
}
