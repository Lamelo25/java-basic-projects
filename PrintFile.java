import java.io.IOException;
import java.io.FileWriter;


public class PrintFile{
	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter("hello.txt");

			fw.write("Hello\n");
			fw.write("World");

			fw.close();


		}catch(IOException e){
			System.out.println(e);
		}
	}
}