package com.example.javatest;

/**
 * 抽象类应用：模板方法模式
 * 模板方法模式（Templete Method）：定义一个操作中的算法的骨架，
 * 而将一些可变部分的实现延迟到子类中。
 * 模版方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定的步骤。
 */
public class Test {

    public static void main(String[] args) {

        AGoHome aGoHome = new AGoHome("A", "北京");
        aGoHome.goHome();

        BGoHome bGoHome = new BGoHome("B", "上海");
        bGoHome.goHome();

    }


}
