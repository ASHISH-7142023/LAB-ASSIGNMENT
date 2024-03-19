package labassignment4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st no.: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd no.: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3rd no.: ");
		int num3 = sc.nextInt();
		int sum=0;
		System.out.println("the nos. are");
		for(int i=num1;i<=num2;i=i+num3)
		{
			System.out.println(i);
			sum =sum+i;
		}
		
		System.out.println(" the Sum of no. displayed "+sum);

		
	}

}
