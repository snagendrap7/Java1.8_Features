package Features;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	private int empno;
	private String name;
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		 return empno+":"+name;
	}
	
}

public class Test3 {
 public static void main(String[] args) {
	 ArrayList<Employee> e=new ArrayList<Employee>();
     e.add(new Employee(101,"nagi"));
     e.add(new Employee(102,"agoo"));
     
    
     
     Collections.sort(e,(e1,e2)->(e1.getName()).compareTo(e2.getName()));
	
     System.out.println(e);

}
}
