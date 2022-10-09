package com.spring.oop.poly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    public void drives(){
        Driver driver = new Driver(new Sonata());
        Car car = driver.drive();
        car.run();
    }

}