import java.util.Scanner;

public class ExitProgram{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		char isExit;

		do{
			System.out.print("Exit[y/n]:");
			isExit = scanner.next().charAt(0);
		}while (isExit =='n'|| isExit=='N'); 
			
		
	}
}