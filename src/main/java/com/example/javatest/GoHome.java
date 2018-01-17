package com.example.javatest;

/**
 * GoHome:抽象类
 * Created by My on 2018/1/17.
 */

public abstract class GoHome {
    // 方便子类使用
    protected String name;
    protected String address;

    public GoHome() {
    }

    // 构造方法的重载，方便为成员变量赋值
    public GoHome(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * 定义一个操作中的算法的骨架
     */
    public void goHome() {
        // 1.自我介绍,父类实现
        this.introduce();
        // 2.买票，A，B地址不同，买不同的票，延伸到子类实现
        this.buyTicket();
        // 3.回家
        System.out.println("票已买到了，回家过年！");
    }


    public void introduce() {
        System.out.println("我是：" + this.name + ",我的家在：" + this.address);
    }

    // 将一些可变部分的实现延迟到子类中
    public abstract void buyTicket();


}
