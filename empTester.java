package ivspR;

public class empTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		//Employee emp1:
		//System.out.println(emp1.empNo); compile time error
		//Employee emp1 = new Employee();
		Employee emp1 = new Employee();
	//	System.out.println(emp1.empNo);
		System.out.println(emp1.empName);
		System.out.println(emp1.empMNo);
		emp1.setEmpNo(1);
		
		//emp1.display(); 0 0  null 0
		//access and fill details
		//emp1.empNo = 123;
		emp1.empName = "sahalu";
		emp1.empMNo = 15874206334l; 

		emp1.display();
		Employee emp2 = new Employee();
		
		emp1.setEmpNo(32);
		emp2.empName = "sah5yalu";
		emp2.empMNo = 158742036334l;
		// i1= 10;
		//emp1 = new Employee();
		

		emp2.display();
	}

}
