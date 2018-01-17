package com.example.javatest;

/**
 * AGoHome
 * Created by My on 2018/1/17.
 */

public class AGoHome extends GoHome {

    public AGoHome(String name, String address) {
        super(name, address);
    }

    @Override
    public void buyTicket() {
        System.out.println("我要买到：" + this.address + "的火车票");
    }
}
