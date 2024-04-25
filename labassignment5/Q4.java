package labassignment5;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m:");
		int m=sc.nextInt();
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		for (int j=m;j<=n;j++)
		{
			int factorial=1;
			for(int i=1;i<=j;i++)
			{
				factorial=factorial*i;
			}
			System.out.println("Factorial of "+j+" is :"+factorial);
		}

	}

}
