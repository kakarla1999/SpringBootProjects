package com.SpringBootProfiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component          creating the beans
//@Profile("dog")      
public class Dog implements Animal
{

	@Override
	public void makeSound()
	{
		System.out.println("Bowww........");
		
	}

}
