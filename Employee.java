package may14;

import java.time.LocalDateTime;

public class Employee {
	static{
		System.out.println("Employee Tracking System");
	}
	
	int id;
	String name;
	String dept;
	static String companyName="Google";
	static int count;
	
	 Employee(String name,String dept,int id){
		this.dept=dept;
		this.id=id;
		this.name=name;
	}
	
	{
		//non static context u can access both static and non-static element
		count++;
	}
	
	{
		System.out.println(LocalDateTime.now());
	}
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Id :"+this.id);
		System.out.println("Dept: "+this.dept);
		System.out.println("Company: "+companyName);
		System.out.println("Count: "+count);
	}
	
}

