package it.giuseppe.spring;



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
    	
        return new Programma("Java.exe", 3.2);
    }
}
