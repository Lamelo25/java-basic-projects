public class FootballClub{
	String team;


	public FootballClub(){
		System.out.println("no-argument constracture...");
	}

	public FootballClub(String t){
		System.out.println("one-argument constracture");

		team =t;
	}

	public void info(){
		System.out.println("TEAM:"+ team);
	}

	public static void main(String[] args) {
		FootballClub fc1= new FootballClub("Manchester City");
		FootballClub fc2= new FootballClub("");
		FootballClub fc3= new FootballClub("Real");

		fc1.info();
		fc2.info();
		fc3.info();
	}

}