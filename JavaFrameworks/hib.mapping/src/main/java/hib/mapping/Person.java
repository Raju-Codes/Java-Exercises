package hib.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	@OneToOne
	Aadhar aadhar;
	
	public Person() {
		super();
	}

	public Person(int id, Aadhar aadhar) {
		super();
		this.id = id;
		this.aadhar = aadhar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", aadhar=" + aadhar + "]";
	}
	
}
