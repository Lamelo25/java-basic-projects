public class Phone{
	String brand;
	String color;
	int price;


	public Phone(String b,String c, int p){
		brand = b;
		color = c;
		price = p;

	}

	public void phoneInfo(){
		System.out.println("BRAND:"+ brand);
		System.out.println("COLOR:"+ color);
		System.out.println("PRICE:"+ price);
	}

	public static void main(String[] args) {
		Phone phone1 = new Phone("Sony","Black",2);
		phone1.phoneInfo();
		System.out.println(phone1.brand);
		System.out.println(phone1.color);
		System.out.println(phone1.price);
	}
}