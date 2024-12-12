package com.in28minutes.learn_spring_framework.hello_world;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// Launch a Spring Context

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("person4"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("address1"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		

		

	}

}
