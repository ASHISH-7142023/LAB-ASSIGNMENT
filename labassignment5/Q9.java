package labassignment5;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1.0/(1*i));
		}
		System.out.println("The sum of series is: "+sum);

	}

}
