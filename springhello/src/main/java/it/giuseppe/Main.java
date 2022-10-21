package it.giuseppe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.giuseppe.spring.Config;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Disco disco = context.getBean(Disco.class);
		System.out.println(disco);
	}

}
