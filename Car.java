import java.util.ArrayList;
import java.util.HashMap;



public class Car{
	String brand;
	int model;

	public Car(String brand,int model){
		this.brand=brand;
		this.model=model;
	}

	public String toString(){
		return "Brand:"+brand+",Model:"+model;
	}
	public static void main(String[] args) {
		Car car1=new Car("Toyota",2020);
		Car car2=new Car("Tesla",2022);

		System.out.println("ARRAY>>>");


		Car[]carArr={car1,car2};
		System.out.println(carArr[0]);

		System.out.println("ARRAY LIST>>>");
		ArrayList<Car>carList=new ArrayList<Car>();

		carList.add(car1);
		carList.add(car2);

		System.out.println(carList);
		
		System.out.println(carList.size());



		HashMap<Integer,String>numMap=new HashMap<>();

		numMap.put(5,"Five");
		numMap.put(6,"Six");


		System.out.println(numMap);
		System.out.println("SZIE:"+numMap.size());


		HashMap<Integer,Car>carMap=new HashMap<>();


		carMap.put(1,car1);
		carMap.put(2,car2);

		System.out.println(carMap);
		System.out.println("Key:"+carMap.keySet());
		System.out.println("Value:"+carMap.values());

		for(int key:carMap.keySet())
			System.out.println(key);

		for(Car value:carMap.values())
			System.out.println(value);
	}
}