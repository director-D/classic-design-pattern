package com.mountaintop.designpattern.state;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 14:23
 * @Version: 1.0
 * @Description:
 */
public class Developer {

    private State state;


    public Developer(State state){
        this.state = state;
    }

    public void setState(State state){
        this.state = state;
    }


    public void develop(){
        state.coding();
    }




}
