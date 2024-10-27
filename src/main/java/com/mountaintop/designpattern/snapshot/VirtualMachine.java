package com.mountaintop.designpattern.snapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 11:15
 * @Version: 1.0
 * @Description:
 */
public class VirtualMachine {

    private String name;

    private String devices;

    private List<String> memory;

    private List<String> storage;

    private String state;


    public VirtualMachine(String name, String devices) {
        this.name = name;
        this.devices = devices;
        this.memory = new ArrayList<String>();
        this.storage = new ArrayList<String>();
        this.state = "created";
    }


    public VirtualMachine createVirtualMachine(String name,String devices){
        return new VirtualMachine(name,devices);
    }

    // 开机、关机、暂停、恢复等功能。。。 略

    /**
     * 打开应用，加载到内存，用来模拟内存中的内容
     */
    public void openApp(String appName) {
        if ("running".equals(state)) {
            this.memory.add(appName);
            System.out.println("虚拟机" + name + "打开应用： " + appName);
        }
    }

    /**
     * 关闭应用，从内存中删除，用来模拟内存中的内容
     */
    public void closeApp(String appName) {
        if ("running".equals(state)) {
            this.memory.remove(appName);
            System.out.println("虚拟机" + name + "关闭应用： " + appName);
        }
    }


    /**
     * 保存文件，写入虚拟磁盘，用来模拟存储中的内容
     */
    public void saveFile(String file) {
        if ("running".equals(state)) {
            this.storage.add(file);
            System.out.println("虚拟机" + name + "中保存文件： " + file);
        }
    }

    /**
     * 删除文件，从虚拟磁盘中删除，用来模拟存储中的内容
     */
    public void delFile(String file) {
        if ("running".equals(state)) {
            this.storage.remove(file);
            System.out.println("虚拟机" + name + "中删除文件： " + file);
        }
    }

    /**
     * 打快照，如果是开机状态会保存内存快照和存储快照；如果是关机状态则仅保存存储快照即可。
     */
    public Snapshot takeSnapshot() {
        if ("shutdown".equals(state)) {
            return new VMSnapshot(null, new ArrayList<String>(storage));
        } else {
            return new VMSnapshot(new ArrayList<String>(memory), new ArrayList<String>(storage));
        }
    }

    /**
     * 恢复快照
     */
    public void restoreSnapshot(Snapshot snapshot) {
        VMSnapshot tmp = (VMSnapshot)snapshot;
        this.memory = new ArrayList<String>(tmp.getMemory());
        this.storage = new ArrayList<String>(tmp.getStorage());
        if (tmp.getMemory() == null) {
            this.state = "shutdown";
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer =  new StringBuffer();
        stringBuffer.append("------\n[虚拟机“" + name + "”] 配置为“" + devices + "”，" + "目前状态为：" + state + "。");
        if ("running".equals(state)) {
            stringBuffer.append("\n    目前运行中的应用有：" + memory.toString());
            stringBuffer.append("\n    最近保存的文件有：" + storage.toString());
        }
        stringBuffer.append("\n------");
        return stringBuffer.toString();
    }

    private static class VMSnapshot implements Snapshot {
        private List<String> memory;
        private List<String> storage;

        public VMSnapshot(List<String> memory, List<String> storage) {
            this.memory = memory;
            this.storage = storage;
        }

        public List<String> getMemory() {
            return memory;
        }

        public void setMemory(List<String> memory) {
            this.memory = memory;
        }

        public List<String> getStorage() {
            return storage;
        }

        public void setStorage(List<String> storage) {
            this.storage = storage;
        }


    }






}
