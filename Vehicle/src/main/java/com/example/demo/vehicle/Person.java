package com.example.demo.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	Vehicle v;
	
	public Person(Vehicle v) {
		super();
		this.v = v;
	}

	public Person() {
		super();
	}

	public Vehicle getV() {
		return v;
	}
	@Autowired
	public void setV(Vehicle v) {
		this.v = v;
	}
	
}
