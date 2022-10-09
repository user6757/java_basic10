package com.spring.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("강아지를 정상적으로 분양받아야 한다.")
    void personTest(){
        Person kim = new Person("김철수");
        Person park = new Person("박영희");

        PatShop dogLover = new PatShop();

        kim.takeDog(dogLover);
        park.takeDog(dogLover);

        assertEquals("뽀비", park.getMyDogName());
        assertEquals("해피", kim.getMyDogName());
    }

}