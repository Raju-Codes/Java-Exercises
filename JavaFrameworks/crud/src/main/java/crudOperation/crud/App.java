package crudOperation.crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	boolean cond = true;
   	
    	while(cond) {
    		
    		System.out.println("\nEnter the key for operation:\n1. create\n2. read\n3. update\n4. delete\n5. exit");
    		String str = sc.next().toLowerCase();
    		
    		switch(str) {
    			case "create":
    				
    				System.out.println("Roll: ");
    				int roll = sc.nextInt();
    				
    				System.out.println("Age: ");
    				int age = sc.nextInt();
    				
    				System.out.println("name: ");
    				String name = sc.next();
    				
    				System.out.println("CGPA");
    				float cgpa = sc.nextFloat();
    				
    				System.out.println("Department");
    				String department = sc.next();

    				create(roll,age,name,cgpa,department);
    				System.out.println("creation is successfuly completed");
    				break;
    				
    			case "read":
    				System.out.println("Enter the roll number:");
    				
    				int num = sc.nextInt();
    				read(num);
    				System.out.println("Above is the data");
    				break;
    				
    			case "update":
    				update();
    				System.out.println("updation is successfuly completed");
    				break;
    				
    			case "delete":
    				System.out.println("Enter the roll");
    				int n = sc.nextInt();
    				delete(n);
    				System.out.println("deletion is successfuly completed");
    				break;
    				
    			case "exit":
    				System.out.println("exited Successfully");
    				cond = false;
    				break;
    			default:
    				System.out.println("\nEnter the above operations only\n");
    		}
    		
    		
    	}
    }
    public static void create(int roll, int age, String name, float cgpa, String department) {
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	
    	Session sess = sf.openSession();
    	Transaction tx=sess.beginTransaction();
    	Student st = new Student(roll, age,name, cgpa,department);
    	sess.persist(st);
    	tx.commit();
    	sess.close();
    }
    public static void read(int num) {
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	Session sess =  sf.openSession();
    	Student st = sess.find(Student.class,num);
    	System.out.println(st);
    	sess.close();
    }
    public static void update() {
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	
    	Session sess = sf.openSession();
    	Transaction tx = sess.beginTransaction();
    	Student st = sess.find(Student.class, 1);
    	st.setMarks(8.5f);
    	
    	sess.merge(st);
    	tx.commit();
    	sess.close();	
    }
    
    public static void delete(int roll) {
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
    	
    	Session sess = sf.openSession();
    	Transaction tx = sess.beginTransaction();
    	Student st = sess.find(Student.class,roll);
    	sess.remove(st);
    	sess.close();
    }
}
