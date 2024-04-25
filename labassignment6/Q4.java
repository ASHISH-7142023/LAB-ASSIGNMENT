package labassignment6;
public class Q4 {
	 public static int numberOfDaysInAYear(int year)
	 {
		 return isLeapYear(year) ? 366 : 365;
	 }
	 public static boolean isLeapYear(int year)
	 {
		 return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2000; i <= 2031; i++)
		{
            System.out.println("Number of days in year " + i + " is " + numberOfDaysInAYear(i) );
        }

	}
	
}
