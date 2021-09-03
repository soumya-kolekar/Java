package practice;

public class chickenRabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		int legs=3;//500
		int head=11;//150
		int temp1,temp2;
		temp1=head*2;
		temp2=legs-temp1;
		c=temp2/4;
		r=head-c;
			if(c<0 || r<0)
				System.out.println("The number of chickens and rabbits cannot be found");
			else{	
		System.out.println("Chickens="+c);//50
		System.out.println("Rabbits="+r);//100
			}
	}

}
