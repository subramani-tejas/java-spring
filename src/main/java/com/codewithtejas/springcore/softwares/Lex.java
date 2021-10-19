package com.codewithtejas.springcore.softwares;

import org.springframework.stereotype.Component;

@Component
public class Lex implements Console {

    @Override
    public void up(){
        System.out.println("Scroll up!");
    }

    @Override
    public void down(){
        System.out.println("Scroll down!");
    }

    @Override
    public void left(){
        System.out.println("Scroll left!");
    }

    @Override
    public void right(){
        System.out.println("Scroll right!");
    }
}
