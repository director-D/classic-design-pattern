package com.mountaintop.designpattern.command.impl;

import com.mountaintop.designpattern.command.Command;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:18
 * @Version: 1.0
 * @Description: Command 中才保持有具体的命令的执行者
 */
public class ShapeDrawingCommand implements Command {

    //命令的具体执行者
    private ShapeDrawer shapeDrawer;

    private String arg;

    public ShapeDrawingCommand(ShapeDrawer shapeDrawer, String arg) {
        this.shapeDrawer = shapeDrawer;
        this.arg = arg;
    }

    @Override
    public void doCommand() {
        shapeDrawer.drawShape(arg);
    }

    @Override
    public void undoCommand() {
        shapeDrawer.undrawShape();
    }
}
