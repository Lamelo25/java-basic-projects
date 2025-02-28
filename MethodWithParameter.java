public class MethodWithParameter{

	public static void main(String[] args) {
		studentInfo("John Doe",25,'M');	

	}

	public static void studentInfo(String name,int age,char gender){
		System.out.println("Name:" + name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
}