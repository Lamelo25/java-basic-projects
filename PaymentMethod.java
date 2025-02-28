class Staff{
	int staffId;
	String name;
	int salary;
	String position;
	int positionId;
	int overtime;


	public Staff(int staffId,String name,int salary,String position, int positionId){
		this.staffId=staffId;
		this.name=name;
		this.salary=salary;
		this.position=position;
		this.positionId=positionId;

	}
	public void stafffInfo(){
		System.out.println("Staff ID:"+staffId);
		System.out.println("Name:"+name);
		System.out.println("Position:"+position);
		System.out.println("PositionId:"+positionId);

		if(overtime>0)
			System.out.println("Salary with overtime:"+salary(positionId));
		else
			System.out.println("Salary without overtime:"+salary());
	}
	public int salary(){
		return salary;
	}

	public int salary(int positionId){
		int temp=salary();

		if(positionId==1)
			temp+=5000*overtime;
		else if(positionId==2)
			temp +=overtime;
		else if(positionId==3)
			temp+=40000*overtime;
		else
			temp +=80000*overtime;

		return temp;
	}
}


public class PaymentMethod{
	public static void main(String[] args) {
		Staff staff1= new Staff(1001,"Lisa",150000,"Staff",1);
		Staff staff2= new Staff(1002,"Rose",1200000,"Full-Stack Developer",4);

		staff1.stafffInfo();

		staff2.overtime=5;
		staff2.stafffInfo();
	}
}