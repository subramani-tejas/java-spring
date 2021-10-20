package com.codewithtejas.springcore;

import com.codewithtejas.springcore.softwares.AppRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.codewithtejas.springcore")
public class SpringCoreApplication {

    public static void main(String[] args) {

//        Spring is responsible for creating objects
        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
        AppRunner runner = context.getBean(AppRunner.class);

        /*
            Programmer is responsible for creating objects (IOC)
            IOC container --> responsible for dependency injection
                          --> manages bean lifecycle
                          --> ex. ApplicationContext, BeanFactory

            Lex lex = new Lex();
            FlightSimulator flight = new FlightSimulator();
            AppRunner runner1 = new AppRunner(flight);
        */
        runner.runApp();
    }

}
