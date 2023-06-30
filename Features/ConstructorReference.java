package Features;
class Sample{
	Sample(String s){
		System.out.println("Sample class Constructor Exceutio wuth argumnet:"+s);
	}
}
interface interfa{
	public void get(String s);
}
public class ConstructorReference {

	public static void main(String[] args) {
		interfa i=Sample::new;
         i.get("durga");
	}

}
