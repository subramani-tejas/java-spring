package com.codewithtejas.springcore.softwares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Component is a class managed by Spring framework
public class AppRunner {

    @Autowired
    private Console console;

    public AppRunner(Console console) {
        this.console = console;
    }

    public void runApp(){
        console.up();
        console.down();
        console.left();
        console.right();
    }
}
