package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDbDataService implements DataService {

	@Override
	public int[] retrieveDate() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
