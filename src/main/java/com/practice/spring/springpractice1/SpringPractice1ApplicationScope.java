package com.practice.spring.springpractice1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.spring.springpractice1.Scope.PersonDAO;


@SpringBootApplication
/*
 * If we have dependency from other package the we need to define
 * @ComponentScan("package location")
 * so that spring can look for that package bean
 */
public class SpringPractice1ApplicationScope {

	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringPractice1ApplicationScope.class);
	public static void main(String[] args) {
		

		ApplicationContext mn= SpringApplication.run(SpringPractice1ApplicationScope.class, args);
		PersonDAO person1=mn.getBean(PersonDAO.class);
		PersonDAO person2=mn.getBean(PersonDAO.class);
		System.out.println(person1);
		System.out.println(person1.getJdbcconnection());
		System.out.println("============================");
		System.out.println(person2);
		System.out.println(person1.getJdbcconnection());
		
		LOGGER.info("{}",person1);
		LOGGER.info("{}",person2);
		
	}

}
