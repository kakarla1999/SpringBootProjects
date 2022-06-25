package com.SpringBootProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.SpringBootProfiles.beans.Animal;


@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner
{
	
	@Value("${company_name}")           // getting the value from properies file
	 private String company;
	
	@Value(value = "${url}")			// getting the value from properies file
	private String url;
	@Autowired(required = true)
	private Animal animal;					

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootProfilesApplication.class, args);
		
		
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
	    
		System.out.println(animal);
		animal.makeSound();
		System.out.println(company);			// printing the value from the properties file
		System.out.println(url);				// printing the value from the properties file
	}

	

	
}
