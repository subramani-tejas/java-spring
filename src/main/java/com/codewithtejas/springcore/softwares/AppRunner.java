package com.codewithtejas.springcore.softwares;

public class AppRunner {
    private Lex lex;
    private FlightSimulator flightSimulator;

//    public AppRunner(Lex lex) {
//        this.lex = lex;
//    }

    public AppRunner(FlightSimulator flightSimulator){
        this.flightSimulator = flightSimulator;
    }

    public void runApp(){
        flightSimulator.up();
        flightSimulator.down();
        flightSimulator.left();
        flightSimulator.right();
    }
}
