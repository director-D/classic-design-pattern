package com.mountaintop.designpattern.command.impl;

import com.mountaintop.designpattern.command.Command;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:23
 * @Version: 1.0
 * @Description:
 */
public class ColorFillingCommand implements Command {


    private ColorFiller colorFiller;

    private String arg;

    public ColorFillingCommand(ColorFiller colorFiller, String arg) {
        this.colorFiller = colorFiller;
        this.arg = arg;
    }


    @Override
    public void doCommand() {
        colorFiller.fillColor(arg);
    }

    @Override
    public void undoCommand() {
        colorFiller.undoFillColor();
    }


}
