package com.mountaintop.designpattern.Flyweight;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 18:27
 * @Version: 1.0
 * @Description:
 */
public class NumsPrinter {

    private NumSeal[] seals;

    public NumsPrinter(String nums) {
        seals = new NumSeal[nums.length()];
        NumSealFactory numSealFactory = new NumSealFactory();
        for (int i = 0; i < nums.length(); i++) {
            seals[i] = numSealFactory.getSeal(nums.charAt(i) - 48);
        }
    }

    public void print() {
        for (int l = 0; l < 10; l++) {
            for (NumSeal seal:seals) {
                seal.sealPrint(l);
            }
            System.out.println();
        }
    }

}
