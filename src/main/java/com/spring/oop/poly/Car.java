package com.spring.oop.poly;

class Avante implements Car{


    @Override
    public void run() {
        System.out.println("아반테가 달린다.");
    }

    @Override
    public void back() {

    }
}

class Sonata implements Car{


    @Override
    public void run() {
        System.out.println("소나타가 달린다.");
    }

    @Override
    public void back() {

    }
}
class granger implements Car{


    @Override
    public void run() {

    }

    @Override
    public void back() {

    }
}

public interface Car {

    public void run();
    public void back();

}
