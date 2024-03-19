package labassignment3;
import java.util.Scanner;
public class Q7 {

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
		else if (x<=200)
		{
			bill=50*3+((x-50)*4.80);
		}
		else if (x<=400)
		{
			bill=50*3+(150*4.80)+((x-200)*5.80);
		}
		else if(x>400)
		{
			bill=50*3+(150*4.80)+(200*5.80)+((x-400)*6.20);
		}
		System.out.println("No. of units is: "+x);
		System.out.println("Do U Want To Pay Online(Y/N)");
		char p;
		p=sc.next().charAt(0);
		double d=0,t=0;
		if (p=='y' || p=='Y') {
			d=bill*0.03;
			t=bill-d;
		}
		else  {
			d=0;
			t=bill-d;
		}
		System.out.println("Total amount: "+bill);
		System.out.println("Discount: "+d);
		System.out.println("Amount payable: "+t);
		
		
		sc.close();

	}

}
