package hib.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Aadhar {
	@Id
	int adharnumber;
	String name;
	String dob;
	String gender;
	String address;
	@OneToOne
	Person person;
	public Aadhar() {
		super();
	}
	
	public Aadhar(int adharnumber, String name, String dob, String gender, String address, Person person) {
		super();
		this.adharnumber = adharnumber;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.person = person;
	}

	public int getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Aadhar [adharnumber=" + adharnumber + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", person=" + person + "]";
	}
}
