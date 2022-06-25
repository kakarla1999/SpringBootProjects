package com.SpringBootProfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.SpringBootProfiles.beans.MyDatasource;

@Configuration
//@PropertySource("classpath:myDatasource.properties")
public class myConfiguration
{
	@Bean
	public MyDatasource mydatasource(@Value(value = "${mydatasource.username}") String username , @Value(value = "${mydatasource.password}") String password ,  @Value(value = "${url}") String url)
	{
		MyDatasource mydatasource = new MyDatasource();
		
		mydatasource.setUsername(username);
		mydatasource.setPassword(password);
		mydatasource.setUrl(url);
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(url);
		
		
		return mydatasource;
		
		
		
	}
}
