package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("ClassB is initialized");
		this.classA = classA;
	}
	void doSomething() {
		System.out.println("do something");
	}
}


@Configuration
@ComponentScan
public class LazyInitializationtLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationtLauncherApplication.class)) 
		{
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomething();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
