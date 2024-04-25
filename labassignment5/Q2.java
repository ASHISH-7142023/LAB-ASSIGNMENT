package labassignment5;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num=sc.nextInt();
		int temp=num,reverse=0;
		while (temp>0)
		{
			int LastDigit=temp%10;
			reverse=reverse*10+LastDigit;
			temp/=10;
		}
		boolean isprime1=true,isprime2=true;
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isprime1=false;
				break;
			}
		}
		for(int i=2;i<=Math.sqrt(reverse);i++)
		{
			if(reverse%i==0)
			{
				isprime2=false;
				break;
			}
		}
		if(isprime1 && isprime2)
			System.out.println(num+"is a Twisted Prime");
		else
			System.out.println(num+"is not a Twisted Prime");
		sc.close();
		
	}

}
