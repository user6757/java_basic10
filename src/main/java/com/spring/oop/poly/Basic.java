package com.spring.oop.poly;

class A {

}

class B extends A {
}

class C extends A {
}

class D extends A {
}

class E extends A {
}


public class Basic {

    A a = new A();
    Object al = a;


    public Basic(){
        A a = new A();
        Object a1 = a;

        B b = new B();
        Object ob = b;
    }

    public static void main(String[] args) {

    }

}
