package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(KalkulatorApplication.class, args);

        Calculator calculator = new Calculator(15.00,89.58);

        System.out.println("\nKalkulator\n");
        System.out.println(calculator);
        System.out.println("Dodawanie: " + calculator.add());
        System.out.println("Odejmowanie: " + calculator.sub());
    }
}