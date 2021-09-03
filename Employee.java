package ivspR;

public class Employee {
 private int empNo;
 public String empName;
 private float empSal;
 public long empMNo;
 public void setEmpNo(int in_empNo) {
	 empNo = in_empNo;
 }
 
	public void display() {
		// method
		System.out.println("employee detail :" + empNo);
		System.out.println(" " + empName);
		System.out.println(" " + empSal);
		System.out.println(" " + empMNo);
		

	}
	public float calc() {
		
		float bonus = empSal * 20/100;
		return bonus;
	}

}
