package com.spring.basic;

public class Person {
    String name; //사람이음
    Dog myDog; // 개 객체

    Person(String name){
        this.name = name;
    }

    //강아지를 분양받는 기능
    void takeDog(PatShop shop){
        Dog dog = shop.giveDog(1000000);

        if(dog != null){
            System.out.printf("%s가 %s를 분양받았습니다.", this.name, dog.name);

            this.myDog = dog;

        }else{
            System.out.println("돈이 없어서 분양이 안됨");
        }
    }

    public String getMyDogName(){
        return myDog.name;
    }
}
