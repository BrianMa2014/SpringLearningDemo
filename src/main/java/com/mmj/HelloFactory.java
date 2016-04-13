package com.mmj;

/**
 * Created by MaMingJiang on 2016/4/13.
 */
public class HelloFactory {

    public static Hello newHelloInstance(String msg){
        return new Hello(msg);
    }
}
