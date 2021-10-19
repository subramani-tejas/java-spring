package com.codewithtejas.springcore.softwares;

import org.springframework.stereotype.Component;

public class FlightSimulator implements Console {

    @Override
    public void up(){
        System.out.println("Fly up!");
    }

    @Override
    public void down(){
        System.out.println("Fly down!");
    }

    @Override
    public void left(){
        System.out.println("Bank left!");
    }

    @Override
    public void right(){
        System.out.println("Bank right!");
    }
}
