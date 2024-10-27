package com.mountaintop.designpattern.state;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 10/27/24 14:27
 * @Version: 1.0
 * @Description:
 * 总结
 * 这就是状态模式，将不同的状态包装为不同的类，供其本体引用，从而实现灵活的状态切换。
 *
 * 看到这里其实感觉状态模式和策略模式很像，状态模式是将不同的状态对象作为成员变量给使用者（也称”环境“），策略模式是将不同的策略对象作为成员变量给使用者（也称”环境“）。其实二者还是有些使用上的区别的：
 *
 * 策略模式中，作为成员变量的策略对象通常不会经常变化；而状态模式在使用者（也称”环境“）的整个生命周期中会不断变化。
 * 策略模式中，通常并不明确告诉客户端所选择的具体策略；而状态模式中，所处的状态是明确告知客户端的；
 * 通常策略模式的使用者自己选择一个具体策略；而状态模式的使用者（也称”环境“）通常是被动使用某种状态。
 * 使用场景
 *
 * 一个对象的行为依赖于它所处的状态，对象的行为必须随着其状态的改变而改变；
 * 对象在某个方法里依赖一重或多重的条件转移语句，而且其中有大量代码的时候。
 * 注意事项
 *
 * 状态模式并未规定哪个角色来进行状态切换，上边的例子是由使用者（也称”环境“）的setState方法来切换状态，而有些情况下是由”状态“对象本身来切换到下一个状态。
 * 使用者（也称”环境“）也可以把自己作为参数传递给状态对象，从而状态对象也可以调用使用者的方法
 */
public class Client {

    public static void main(String[] args) {
        Developer developer = new Developer(new EffectiveState());
        developer.develop();
        developer.setState(new ExhaustedState());
        developer.develop();
        developer.setState(new TianRenHeYiState());
        developer.develop();
    }


}
