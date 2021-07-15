package com.springrest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

/**
 * springrest
 * @author Desenvolvedor
 * 15 de jul de 2021
 * https://github.com/jaimedessilva/
 */

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	
	@Profile("dev")
	@Bean
	public String testDataBaseConnection() {
		System.out.println("DB connection for DEV H2");
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		
		return "DB Connection to H2_Test - Test Instance";
	}
	
	@Profile("prod")
	@Bean
	public String productionDatabaseConnection () {
		System.out.println("DB connection for DEV PROD");
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		
		return "DB Connection POSTGRESQL_PROD";
	}
	
	@Profile("test")
	@Bean
	public String testDatabaseConnection () {
		System.out.println("DB connection for DEV PROD");
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		
		return "DB Connection POSTGRESQL_TEST";
	}


}

