package practice;

public class Tester5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement your code here 
				int day=1;
				int month=9;
				int year=15;

				int month_length=31;
				year=year+2000;
						boolean leap_year;
		            if (year % 4 == 0)
		               {leap_year = true;}
		            else
		               { leap_year = false;}




		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
		month_length = 31;
		if( month == 2){
		   if (leap_year == true){
		       month_length = 29;}
		   else
		      { month_length = 28;}}
		else
		   month_length = 30;}


		if(day<month_length){
		   day =day+1;}
		else
		   {day = 1;}

		   if( month == 12 ){month = 1;
		       year += 1;}

		   else{

		       month += 1;
		   }
		       	System.out.println(day+"-"+month+"-"+year);
	}

}
