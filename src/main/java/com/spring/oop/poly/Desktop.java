package com.spring.oop.poly;

import com.spring.oop.inherit.Player;

public class Desktop {

    Monitor monitor;
    Object[] obj;

    public Desktop(Monitor monitormodel){
        this.monitor = monitormodel;

        obj = new Object[]{new LgMonitor(), new HpMonitor()};
    }

   // public static void main(String[] args) {

    //}


}
