package com.mountaintop.designpattern.command;

import com.mountaintop.designpattern.command.impl.ColorFiller;
import com.mountaintop.designpattern.command.impl.ColorFillingCommand;
import com.mountaintop.designpattern.command.impl.ShapeDrawer;
import com.mountaintop.designpattern.command.impl.ShapeDrawingCommand;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:28
 * @Version: 1.0
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        DrawingApp drawingApp = new DrawingApp();

        ShapeDrawer shapeDrawer = new ShapeDrawer();
        ColorFiller colorFiller = new ColorFiller();


        drawingApp.takeCommand(new ShapeDrawingCommand(shapeDrawer,"三角形"));


        drawingApp.takeCommand(new ShapeDrawingCommand(shapeDrawer,"圆形"));

        drawingApp.takeCommand(new ColorFillingCommand(colorFiller,"红色"));

        drawingApp.takeCommand(new ColorFillingCommand(colorFiller,"绿色"));

        drawingApp.commandsDone();

        drawingApp.undoLastCommand();





    }


}
