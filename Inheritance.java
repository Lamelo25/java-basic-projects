class Vehicle{
	protected String type;
	protected int modelYear;

	public void vehicleInfo(){
		System.out.println("TYPE:"+type);
		System.out.println("MODEL YEAR:"+modelYear);
	}
}

class Porsche extends Vehicle{
	String color;

	public void info(){
		System.out.println("COLOR:"+color);
	}
}

public class Inheritance{
	public static void main(String[] args) {
		Porsche p= new Porsche();

		p.type="Engine";
		p.modelYear=2020;
		p.vehicleInfo();

		p.color="Red";
		p.info();
	}
}