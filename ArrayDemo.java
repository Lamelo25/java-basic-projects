public class ArrayDemo{
	public static void main(String[] args) {
		
		int[] nums= new int[3];

		nums[0]=5;
		nums[1]=10;
		nums[2]=15;

		System.out.println("Array size:" + nums.length);
		for (int x=0;x<=2 ;x++ ) {
			System.out.println("nums["+x+"]:"+ nums[x]);
			
		}
	}
}