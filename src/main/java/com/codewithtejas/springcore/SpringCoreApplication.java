package com.codewithtejas.springcore;

import com.codewithtejas.springcore.softwares.AppRunner;
import com.codewithtejas.springcore.softwares.FlightSimulator;
import com.codewithtejas.springcore.softwares.Lex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	// test commit
	public static void main(String[] args) {
		// SpringApplication.run(SpringCoreApplication.class, args);

		// Lex lex = new Lex();
		FlightSimulator flight = new FlightSimulator();
		AppRunner runner = new AppRunner(flight);
		runner.runApp();
	}

}
