package com.practice.spring.springpractice1.demo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.practice.spring.springpractice1.properties.readFromPropertiesFile;


@PropertySource("classpath:app.proferties")
//@SpringBootApplication
@ComponentScan(basePackages={"com.practice.spring.springpractice1.properties"})
public class SpringPractice1ApplicationProperties {
	
	public static Logger LOGGER=
			LoggerFactory.getLogger(SpringPractice1ApplicationProperties.class);

	public static void main(String[] args) {
		
	
		ApplicationContext mn= SpringApplication.run(SpringPractice1ApplicationProperties.class, args);
		readFromPropertiesFile readproperties=mn.getBean(readFromPropertiesFile.class);
		
		System.out.println(readproperties.getUrl());
		
		LOGGER.info("bean -> {}",(Object)mn.getBeanDefinitionNames());
		
		//System.out.println((Object)mn.getBeanDefinitionNames());
	
		
	}

}
