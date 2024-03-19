package labassignment3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input 1st number:");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		System.out.println("Input 2nd number:");
		b=sc.nextInt();
		System.out.println("Input 3rd number:");
		c=sc.nextInt();
		if (c>b && b>a)
		{
			System.out.println("Increasing order");
		}
		else if(a>b && b>c) {
			System.out.println("Decreasing order");
		}
		else {
			System.out.println("Neither Increasing nor Decreasing order");
		}
		sc.close();
		

	}

}
