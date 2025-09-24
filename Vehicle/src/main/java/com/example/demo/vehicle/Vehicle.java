package com.example.demo.vehicle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public interface Vehicle {
	 void drive();
}
@Component

class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving Car:");
	}
}
@Component
class  Bus implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving Bus:");
	}
}
@Component
@Primary
class  Bike implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving Bike:");
	}
}
