public class IfStatement{
	public static void main(String[] args) {
		int num1=5;
		int num2=2;

		if (num1> num2) {
			System.out.println(num1 +"is greater than"+ num2);
			
		}else if (num1< num2) {
			System.out.println(num1+"is less than"+ num2);
		}else{
			System.out.println(num1+"is equal to"+num2);
		}

	}
}