package com.spring.oop.inherit;

public class Player {

    private String nickName;
    private int lever;
    private int hp;


    public Player(String nickName){
        this.nickName = nickName;
        this.lever = 1;
        this.hp = 50;
    }


    public void info(){
        System.out.println("=============캐릭터 정보=============");
        System.out.println("닉네님" +nickName);
        System.out.println("레벨" + lever);
        System.out.println("체력"+ hp);
    }
}
