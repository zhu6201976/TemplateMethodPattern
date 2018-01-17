package com.example.javatest;

/**
 * Created by My on 2018/1/17.
 */

public class BGoHome extends GoHome {

    public BGoHome(String name, String address) {
        super(name, address);
    }

    @Override
    public void buyTicket() {
        System.out.println("我要买到：" + this.address + "的火车票");
    }
}
