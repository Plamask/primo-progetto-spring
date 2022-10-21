package it.giuseppe.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.giuseppe.Programma;
import it.giuseppe.Disco;

@Configuration
@ComponentScan(basePackageClasses = Disco.class)


public class Config {
    @Bean
    public Programma getProgramma() {
    	String nome;
    	double dim;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Inserisci nome del programma");
    	nome = input.nextLine();
    	System.out.println("Inserisci la dimensione");
    	dim = input.nextDouble();
    	input.close();
        return new Programma(nome, dim);
    }
}