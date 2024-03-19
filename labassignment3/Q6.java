package labassignment3;
import java.util.Scanner;
public class Q6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the units");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double bill=0;
		if (x<=50)
		{
			bill=x*3;
		}
		else if (x<50 && x<=200)
		{
			bill=50*3+((x-50)*4.80);
		}
		else if (x<200 && x<=400)
		{
			bill=50*3+(150*4.80)+((x-200)*5.80);
		}
		else if(x<200 && x>400)
		{
			bill=50*3+(150*4.80)+(200*5.80)+((x-400)*6.20);
		}
		System.out.println("Your bill is "+bill);
		sc.close();
		
	}

}