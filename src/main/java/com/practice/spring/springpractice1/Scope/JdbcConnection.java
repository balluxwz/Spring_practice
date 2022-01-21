package com.practice.spring.springpractice1.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)

/*
 * This is the dependency of PersonDAO class so if we want to make different instance
 * of this then we have to use proxy like used above normal scopre_prototype will
 * not work in this case
 */
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.print("Jdbc Connection...");
	}

}
