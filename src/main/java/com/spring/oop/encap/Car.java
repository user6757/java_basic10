package com.spring.oop.encap;

public class Car {

    final String model;
    private int currentSpeed;
    private int limitSpeed;

    Car(String model, int limitSpeed){
        this.model = model;
        this.limitSpeed = limitSpeed;
    }

    void powerOn(){
        System.out.println("엔진오일을 분사합니다");
    }

    public void on(){
        powerOn();
        injectGas();
        injectoil();
        moveCylinder();
        accelartor();
    }
    void injectoil(){
        System.out.println("엔진오일을 분사합니다.");
    }
    void injectGas(){
        System.out.println("가솔린을 분사합니다.");
    }

    private void moveCylinder(){
        System.out.println("실린더를 움직입니다.");
    }



    void accelartor(){
        System.out.println("악셀을 밟았습니다.");
        if (this.currentSpeed > 300){
            System.out.println("제한속도를 초과하였습니다.");
        }else {
            this.currentSpeed = currentSpeed;
        }
    }



}
