package com.spring.basic;

public class Dog {

    String name;
    String kind;
    int age;

    //생성자(함수)
    Dog(String name, String kind){
        this.name = name;
        this.kind = kind;
        this.age = 1;
    }

    void bite(String target){
        System.out.printf("%s 멍멍이는 %s 깨물어요~\n", name, target);
    }
    void introduce(){
        System.out.printf("우리강아지종은 %s이고 나이는 %d", kind, age);
    }
}
