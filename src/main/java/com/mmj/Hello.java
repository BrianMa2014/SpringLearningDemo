package com.mmj;

/**
 * Created by MaMingJiang on 2016/4/11.
 */
public class Hello {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void say(){
        System.out.println("Hello," + this.msg);
    }
}
