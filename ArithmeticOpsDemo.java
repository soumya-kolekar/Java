package IvsPracticePrograms;

public class ArithmeticOpsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// %and/ 
		int i=10;
		int m=200;
		float f1=(float)m/i;
		System.out.println(m/i);
		System.out.println(m%i);
		System.out.println(f1);
		//=
		int j=20;
		// add 20 to i and assign to i->i=i+20
		System.out.println(i);
		i+=20;
		System.out.println(i);
		i*=20;
		System.out.println(i);
		i-=85;
		System.out.println(i);
		i/=10;
		System.out.println(i);
		i%=5;
		System.out.println(i);
//LOgical && and
		System.out.println((i >= 1) && (j <= 20));
		//LOgical ||
				System.out.println((i >= 1) || (j <= 20));
		//LOgical !
				System.out.println(! (j <= 20));
		//LOgical !
				System.out.println(!(i >= 15));		
	}

}
