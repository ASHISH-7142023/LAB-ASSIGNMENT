package labassignment5;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter 1st no.:");
		int n1=sc.nextInt();
		System.out.print("Enter the 2nd no.:");
		int n2=sc.nextInt();
		int sum1=0;
		int sum2=0;
		for (int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for (int j=1;j<n1;j++)
		{
			if(n2%j==0)
			{
				sum2=sum2+j;
			}
		}
		if (sum1==n2 && sum2==n1)
		{
			System.out.println(n1+" and "+n2+" are amicable number");
		}
		else
		{
			System.out.println(n1+" and "+n2+" are not amicable number");
		}

	}

}
