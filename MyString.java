public class MyString{
	public static void main(String[] args) {


		
		String msg="Hello, World";

		System.out.println(msg.length());
		System.out.println(msg.charAt(7));
		System.out.println(msg.indexOf("W"));


		String firstName="John";
		String lastName="Doe";
		String userName=firstName.concat("").concat(lastName);
		System.out.println(userName);
		// String userName = firstName+""+lastName;

		String address="     Yangon    ";
		address = address.trim();
		System.out.println(address);

		String hero="lesley";

		if (hero.contains("lesey"))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");	
		
		if(hero.equals("lesley"))
			System.out.println("equal");

		else
			System.out.println("not equal");
	}
}
