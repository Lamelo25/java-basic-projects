import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("enter your name:");
		String name= scanner.nextLine();

		System.out.println("Hello,"+ name);
	}
}