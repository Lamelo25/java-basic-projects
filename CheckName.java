

public class CheckName{
	public static void main(String[] args) {
		String[]heros={
			"John Doe",
			"Jane Doe",
			"Will Smith",
			"John Smith"
		};

		int total=0;
		int other=0;

		for (int x=0;x<heros.length ;x++ ) {

			if (heros[x].toLowerCase().startsWith("john")) {
				System.out.println(heros[x]);total++;
			}else{
				other++;
			}
		}

		System.out.println("TOTAL USERS:"+ total);
		System.out.println("OTHER USERS:"+ other);


	}
}