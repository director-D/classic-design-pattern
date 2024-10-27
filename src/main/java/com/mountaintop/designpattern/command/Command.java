package com.mountaintop.designpattern.command;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:15
 * @Version: 1.0
 * @Description:
 */
public interface Command {

    void doCommand();

    void undoCommand();

}
