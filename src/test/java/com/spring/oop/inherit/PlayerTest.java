package com.spring.oop.inherit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerTest(){
        Warrior w = new Warrior("누가하냐");
        w.info();
    }

}