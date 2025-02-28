public class MethodBasic{
	public static void main(String[] args) {
		MethodBasic.hello();
		hello();

		int temp = getAge();
		System.out.println(temp);

		System.out.println(message());
	}

	public static void hello(){
		System.out.println("Hello, World!");
	}

	public static int getAge(){
		int age= 10;

		return age;
	}
	public static String message(){
		return "Hello";
	}
}