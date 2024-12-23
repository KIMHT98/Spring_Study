package com.in28minutes.learn_spring_framework.hello_world;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age , Address address) {
};

record Address(String street, String city) {};

//Configure the things that we want Spring to manage - @Configuration
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "HyeonTae";
	}

	@Bean
	public int age() {
		return 26;
	}

	@Bean
	@Primary
	public Person person() {
		var person = new Person("Ravi",20, new Address("Main Streen", "New York"));
		return person;
	}
	
	@Bean
	
	public Person person2() {
		var person = new Person(name(),age(), address1());
		return person;
	}
	
	@Bean
	public Person person3(String name, int age, Address address1) {
		var person = new Person(name,age, address1);
		return person;
	}
	@Bean
	public Person person4(String name, int age, @Qualifier("address2qualifier")Address address) {
		var person = new Person(name,age, address);
		return person;
	}

	@Bean(name = "address1")
	public Address address1() {
		var address = new Address("Pyeongnaero","Namyangju");
		return address;
	}
	@Bean(name = "address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		var address = new Address("Main Street","Main City");
		return address;
	}

}
