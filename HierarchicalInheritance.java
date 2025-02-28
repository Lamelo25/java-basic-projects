// import java.lang.Math;

class Shape{
	final double PI = Math.PI;
	int length;
	int width;
	int radius;
	double area;

}

class Square extends Shape {
	public void calculateSquareArea(){
	area = length * length;
	System.out.println("Square Area: "+ (int)area);
	}
}

class Circle extends Shape {
	public double calculateCircleArea(){
		area = PI*radius*radius;
		return area;
		//return area = PI*radius*radius;
	}


}

public class HierarchicalInheritance{
	public static void main(String[] args) {
		Square square = new Square();
		square.length = 3;
		square.calculateSquareArea();

		Circle circle = new Circle();
		circle.radius = 2;
		circle.calculateCircleArea();
		System.out.println("Circle Area: "+ circle.calculateCircleArea());
	}
}



