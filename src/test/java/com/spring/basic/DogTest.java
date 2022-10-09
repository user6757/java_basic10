package com.spring.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    //테스트 이름은 단언 기법을 사용한다.
    @Test
    @DisplayName("강아지 생성해보기")

    void createTest(){

        Dog poppy = new Dog("뽀비", "푸들");
        System.out.println("poppy:" + poppy);
        poppy.bite("저녀석");
        poppy.introduce();

   //     new Dog().introduce();
        Dog happy = new Dog("짱이", "말티즈");

        happy.bite("일반");
        happy.introduce();
    }
}