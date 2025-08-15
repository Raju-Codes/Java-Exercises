package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient {
	public static void main(String[] args) throws Exception {
		Serialization();
		Deserialize();
		
	}
	public static void Serialization() throws Exception {
		Student1 st = new Student1("Raj", 2432, 7.5f, 556633);
		FileOutputStream fos = new FileOutputStream("simple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(st);
		oos.close();
		fos.close();
	}
	public static void Deserialize() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("simple.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student1 st = (Student1)ois.readObject();
		System.out.println(st);
		ois.close();
		fis.close();
	}
}
class Student1 implements Serializable {
	String name;
	int roll;
	float cgpa;
	transient int otp;
	
	public Student1(String name, int roll, float cgpa, int otp) {
		super();
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", roll=" + roll + ", cgpa=" + cgpa + ", otp=" + otp + "]";
	}
}
