public class VariableType{

		//Class variables
	static String staticVar = "Static variable";
	String instanceVar = "Instance/non-static variable";

	public static void main(String[] args) {
		// 		Class.static
		System.out.println(VariableType.staticVar);
		System.out.println(staticVar);


		//  	object.non-static
		VariableType obj= new VariableType();
		System.out.println(obj.instanceVar);
	}
}