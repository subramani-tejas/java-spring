package com.codewithtejas.springcore.softwares;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MsPacMan implements Console {
    @Override
    public void up() {
        System.out.println("Blinky moves up!");
    }

    @Override
    public void down() {
        System.out.println("Blinky moves down!");
    }

    @Override
    public void left() {
        System.out.println("Blinky moves left!");
    }

    @Override
    public void right() {
        System.out.println("Blinky moves right!");
    }
}
