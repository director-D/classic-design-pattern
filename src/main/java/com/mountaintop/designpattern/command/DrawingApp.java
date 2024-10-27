package com.mountaintop.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:13
 * @Version: 1.0
 * @Description: https://blog.51cto.com/liukang/2049456
 *  总结
 * 通过以上例子，我们可以总结出命令模式的特点：
 *
 * 将命令封装为对象作为传递媒介；
 * 命令发出者（invoker）和命令执行者（receiver）是解耦的，通过命令对象“牵线”，invoker维护有命令（或命令集合）的引用，命令中有receiver的引用。
 * 命令模式的应用场景( 转载）：
 *
 * Multi-level undo（多级undo操作）。如果系统需要实现多级回退操作，这时如果所有用户的操作都以command对象的形式实现，系统可以简单地用stack来保存最近执行的命令，如果用户需要执行undo操作，系统只需简单地popup一个最近的command对象然后执行它的undo()方法既可。
 * Transactional behavior（原子事务行为）。借助command模式，可以简单地实现一个具有原子事务的行为。当一个事务失败时，往往需要回退到执行前的状态，可以借助command对象保存这种状态，简单地处理回退操作。
 * Progress bars（状态条）。假如系统需要按顺序执行一系列的命令操作，如果每个command对象都提供一个getEstimatedDuration()方法，那么系统可以简单地评估执行状态并显示出合适的状态条。
 * Wizards（导航）。通常一个使用多个wizard页面来共同完成一个简单动作。一个自然的方法是使用一个command对象来封装wizard过程，该command对象在第一个wizard页面显示时被创建，每个wizard页面接收用户输入并设置到该command对象中，当最后一个wizard页面用户按下“Finish”按钮时，可以简单地触发一个事件调用execute()方法执行整个动作。通过这种方法，command类不包含任何跟用户界面有关的代码，可以分离用户界面与具体的处理逻辑。
 * GUI buttons and menu items（GUI按钮与菜单条等等）。Swing系统里，用户可以通过工具条按钮，菜单按钮执行命令，可以用command对象来封装命令的执行。
 * Thread pools（线程池）。通常一个典型的线程池实现类可能有一个名为addTask()的public方法，用来添加一项工作任务到任务队列中。该任务队列中的所有任务可以用command对象来封装，通常这些command对象会实现一个通用的接口比如java.lang.Runnable。
 * Macro recording（宏纪录）。可以用command对象来封装用户的一个操作，这样系统可以简单通过队列保存一系列的command对象的状态就可以记录用户的连续操作。这样通过执行队列中的command对象，就可以完成"Play back"操作了。
 * Networking。通过网络发送command命令到其他机器上运行。
 * Parallel Processing（并发处理）。当一个调用共享某个资源并被多个线程并发处理时。
 *
 *
 */
public class DrawingApp {


    private final List<Command> commands = new ArrayList<>();


    public void takeCommand(Command command){
        commands.add(command);
    }

    public void commandsDone(){
        for (Command command : commands) {
            command.doCommand();
        }
    }

    public void undoLastCommand(){
        commands.get(commands.size()-1).undoCommand();
    }


}
