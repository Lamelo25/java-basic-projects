public class Person{

	//state
	String name;

	//behaviors
	public void personInfo(){
		System.out.println("NAME:"+ name);
	}


	public static void main(String[] args) {
		Person person1 = new Person();


		person1.name = "Alice";
		person1.personInfo();

	}
}