import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String args[]) throws IOException {
		Student st = new Student("Raj", 25, 5.3f);
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(st);
		oos.close();
	}
}

class Student implements Serializable {
	String name;
	int roll;
	float cgpa;
	
	public Student(String name, int roll, float cgpa) {
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", cgpa=" + cgpa + "]";
	}
	
}
