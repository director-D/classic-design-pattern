package com.mountaintop.designpattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 18:26
 * @Version: 1.0
 * @Description:
 */
public class NumSealFactory {

    private Map<Integer, NumSeal> seals = new HashMap<Integer, NumSeal>(10);
    public NumSeal getSeal(Integer num) {
        NumSeal seal = seals.get(num);
        if (seal == null) {
            seal = new NumSeal(num);
            System.out.println("制作一个数字为" + num + "的印章");
            seals.put(num, seal);
            return seal;
        }
        return seal;
    }

}
