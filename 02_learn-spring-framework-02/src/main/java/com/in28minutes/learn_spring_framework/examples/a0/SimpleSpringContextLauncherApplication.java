package com.in28minutes.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan

public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
