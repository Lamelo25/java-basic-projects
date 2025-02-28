public class TwoDimationalArray{
	public static void main(String[] args) {
		
		int[][] two=new int[2][3];

		two[0][0]=5;
		two[0][1]=10;
		two[0][2]=15;

		two[1][0]=20;
		two[1][1]=25;
		two[1][2]=30;

		for (int x=0;x<2 ;x++ ) {
			for (int y=x;y<3 ;y++ ) {
				System.out.println(two[x][y]);
			}
			
		}
	}
}