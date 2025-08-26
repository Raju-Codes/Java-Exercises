package crudOperation.crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int roll;
	int age;
	String name;
	float marks;
	String department;
	
	
	public Student() {
		super();
	}

	public Student(int roll, int age, String name, float marks, String department) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.marks = marks;
		this.department = department;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + ", marks=" + marks + ", department="
				+ department + "]";
	}
}
