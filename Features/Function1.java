package Features;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}

public class Function1 {

	public static void main(String[] args) {
	Function<Integer, Integer> f=i->i*i;
	System.out.println(f.apply(4));
	
	Function<String,Integer> f1=i->i.length();
	System.out.println(f1.apply("durga"));

	ArrayList<Student> a=new ArrayList<Student>();
	a.add(new Student("nagi", 90));
	a.add(new Student("nagoo",80));
	a.add(new Student("nnaan",20));
	a.add(new Student("nadi",70));
	a.add(new Student("ananan",50));
	
	Function<Student, String> f2=s->{
		int mark=s.marks;
		String grade="";
		if(mark<=90)  grade="distinct";
		else if(mark<=60) grade= "good";
		else if(mark<=40) grade="not bad";
		else grade="Fail";
		return grade;
	};
    for(Student s:a) {
    	System.out.println("The marks of="+f2.apply(s));
    	System.out.println("the name is"+s.name);
    	System.out.println();
    }
	}

}
