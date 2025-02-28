public class MyMath{
	public static void main(String[] args) {
		
		System.out.println("MAX:"+ max(5,2));
		System.out.println("MIN:"+ min(5,2));

	}
	// 				(parameters)
	public static int max(int num1,int num2){
		int temp;

		if (num1>num2) 
			temp =num1;
		else
			temp=num2;
			

			return temp;		
	}

	public static int min(int num1,int num2){

		if(num1>num2)
			return num2;
		else
			return num1;
	}
}