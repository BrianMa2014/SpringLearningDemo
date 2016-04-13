package com.mmj;

/**
 * Created by MaMingJiang on 2016/4/13.
 */
public class HelloFactory2 {
    public Hello getHelloInstance(String msg){
        return new Hello(msg);
    }
}
