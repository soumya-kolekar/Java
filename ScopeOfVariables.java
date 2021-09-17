package DayOne;

public class ScopeOfVariables {
int i=34;//instance variable
static int z;//class variable
static {
	z=10;
	System.out.println("inside static block "+z);
}
void test() {
	int z=200;
	System.out.println("local var:"+(z+i));
}
public static void main(String[] args) {
	ScopeOfVariables n=new ScopeOfVariables();
	n.test();
	System.out.println(n.i);

	
}
}
