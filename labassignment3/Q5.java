package labassignment3;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the year:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean tf;
		if (x%4==0 && x%100==0 || x%400==0)
		{
			tf=true;
			System.out.println(x+" is a leap year: "+tf);
	    }
		else
		{
			tf=false;
			System.out.println(x+" is a leap year: "+tf);
		}
		sc.close();
		
	}

}
