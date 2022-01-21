package com.practice.spring.springpractice1.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
 * The scope is used to create a new instance every time we create a object otherwise by 
 * default it is SINGLETON which means every time same object address will be send on
 * object creation
 */
public class PersonDAO {
    
	@Autowired
	JdbcConnection jdbcconnection;

	public JdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(JdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}

}
