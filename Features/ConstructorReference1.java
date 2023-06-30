package Features;

class student{
	private int rollno;
	private String name;
	private String address;
	private int phon;
	student(int rollno,String name,String address,int phno){
		this.rollno=rollno;
		this.name=name;
		this.address=address;
		this.phon=phno;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", phon=" + phon + "]";
	}
	
}
interface Interface{
	public student get(int rollno,String name,String address,int phno);
}
public class ConstructorReference1 {

	public static void main(String[] args) {
		Interface i=(rollno,name,address,phno)->new student(rollno,name,address,phno);
        i.get(10, "nagi", "bang", 9666);//it general calling method with lambda expression
        Interface i1=student::new;
        i1.get(20, "nago", "dmm", 6302);//it is constructor reference
        //i1.toString();
	}

}
