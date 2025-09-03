package com.back;

public class Rq {

    private String cmd;

    public Rq(String cmd){
        this.cmd = cmd;
    }


    public String getActionName(){

        //?기준 왼쪽을 잘라 반환 -> 자르는 방법 gpt한테 물어보자 -> split

        return cmd.split("\\?")[0];

    }
}
