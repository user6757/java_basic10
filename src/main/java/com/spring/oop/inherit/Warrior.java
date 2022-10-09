package com.spring.oop.inherit;

public class Warrior extends Player{
    private String nickName;
    private int rage;

    public Warrior(){
        super("부모");
        System.out.println("기본생성자 호출");
    }

    public Warrior(String nickName){
        super(nickName);
        System.out.println("warrior생성자 호출");
        this.rage = 100;
    }

    public void info(){
        super.info();
        System.out.println("분노게이지:"+ rage);
    }
}
