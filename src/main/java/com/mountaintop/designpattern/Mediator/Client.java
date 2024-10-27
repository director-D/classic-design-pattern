package com.mountaintop.designpattern.Mediator;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 15:55
 * @Version: 1.0
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        TeamMember xionger = new Developer("熊二");
        TeamMember zhangsan = new Developer("张三");
        TeamMember lisi = new Tester("李四");
        TeamMember wangwu = new Operator("王五");

        TechLeader leader = new TechLeader();
        leader.addTeamMember(xionger);
        leader.addTeamMember(zhangsan);
        leader.addTeamMember(lisi);
        leader.addTeamMember(wangwu);

        // 张三请假
        zhangsan.reportToLeader("组长，世界很大，我想去看看，请假两天～");
    }

}
