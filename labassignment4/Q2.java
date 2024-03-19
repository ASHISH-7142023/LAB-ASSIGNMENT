package labassignment4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.:");
		int num=sc.nextInt();
		int k=num;
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		if (sum%9==0)
		{
			System.out.println("The no."+" is divisible by 9 ");
			
		}
		else
		{
			System.out.println("The no. "+ k +" is NOT divisible by 9 ");
		}
		
	}

}
