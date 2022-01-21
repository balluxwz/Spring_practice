package com.practice.spring.springpractice1.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class readFromPropertiesFile {
	
	@Value("${externalURL}")
    String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
