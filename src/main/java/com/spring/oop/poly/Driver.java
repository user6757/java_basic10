package com.spring.oop.poly;

public class Driver {

    private Car car;

    public Driver(Car drivercar){
        car = drivercar;
    }

    Car drive(){
        return car;
    }

}
