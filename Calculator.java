import java.util.Scanner;

public class Calculator{
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char isExit;

		do{

			System.out.print("enter first number:");
		int num1=scanner.nextInt();

		System.out.print("enter second number:");
		int num2=scanner.nextInt();

		System.out.println(num1);
		System.out.println(num2);

		System.out.print("choose operator[+,-,*,/]:");
		String operator= scanner.next();

		switch (operator) {
			case "+": addition(num1,num2);break;
			case "-": subtraction(num1,num2);break;
			case "*": multiplication(num1,num2);break;
			case "/": division(num1,num2);break;

		}
		System.out.println("Thank you....");

			System.out.print("Exit[y/n]:");
			isExit = scanner.next().charAt(0);
		}while (isExit =='n'); 


		
	}
	
	public static void addition(int a,int b){
		System.out.println("\nADDITION["+a+"+"+b+"]:"+(a+b)+"\n");
	}
	public static void subtraction(int a,int b){
		System.out.println("\nSUBTRACTION["+a+"+"+b+"]:"+(a-b)+"\n");
	}
	public static void multiplication(int a,int b){
		System.out.println("\nMULTIOLICATION["+a+"+"+b+"]:"+(a*b)+"\n");
	}
	public static void division(int a,int b){
		System.out.println("\nDIVISION["+a+"+"+b+"]:"+(a/b)+"\n");
	}
}