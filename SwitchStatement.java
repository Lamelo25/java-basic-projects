public class SwitchStatement{
	public static void main(String[] args) {
		 
		 int day=2;

		 switch(day){
		 case 1:
		 	System.out.println("MON");break;

		 case 2:
		 	System.out.println("TUE");break;

		 default:
		 	System.out.println("Wrong day!");
		 }

		 System.out.println("-------");

		 switch(day){
		 case 1:
		 case 2:
		 case 3:
		 case 4:
		 case 5:System.out.println("weekday");break;

		 case 6:
		 case 7:System.out.println("weekend");break;

		 default:System.out.println("WRONG DAY!");
		 }

	}
}