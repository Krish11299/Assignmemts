package Collections;
import java.util.*;
import java.io.*;

class Employee{
	public int id;
	public String name,Department;
	public double Salary;
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		Department = department;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	
}
class myNameComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

public class TreeSet_Q3 {
public static void main(String[] args) {
	TreeSet<Employee> emp=new TreeSet<Employee>(new myNameComparator());
	emp.add(new Employee(1,"Vinayak", "Developement",28000));
	emp.add(new Employee(2,"Chetna", "Testing",19000));
	emp.add(new Employee(3,"Rahul", "Devops",38000));
	emp.add(new Employee(4,"Vivek", "Data Science",40000));
	emp.add(new Employee(5,"Manish", "Machine Learning",32000));
	
	System.out.println();
	
	for(Employee emp1 : emp) {
		System.out.println(emp1.getName()+"   "+emp1.getDepartment()+"   "+emp1.getSalary()+"   "+emp1.id);
	}
	
}
}
