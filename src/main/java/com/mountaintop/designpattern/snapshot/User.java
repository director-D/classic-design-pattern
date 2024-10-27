package com.mountaintop.designpattern.snapshot;

import java.util.Stack;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 12:06
 * @Version: 1.0
 * @Description:
 */
public class User {

    public static void main(String[] args) {

        Stack<Snapshot> snapshots = new Stack<Snapshot>();

        VirtualMachine ubuntu = new VirtualMachine("ubuntu", "1个4核CPU，8G内存，80G硬盘");

//        ubuntu.startup();
        ubuntu.openApp("网易云音乐");
        ubuntu.openApp("谷歌浏览器");
        ubuntu.saveFile("/tmp/test.txt");
        System.out.println(ubuntu);

        // 打快照
        snapshots.push(ubuntu.takeSnapshot());

        ubuntu.closeApp("网易云音乐");
        ubuntu.openApp("IntelliJ IDEA");
        ubuntu.delFile("/tmp/test.txt");
        ubuntu.saveFile("/workspace/hello.java");
        System.out.println(ubuntu);

        // 恢复快照
        ubuntu.restoreSnapshot(snapshots.peek());
        System.out.println("恢复到最近的快照...");

        System.out.println(ubuntu);

    }


}
