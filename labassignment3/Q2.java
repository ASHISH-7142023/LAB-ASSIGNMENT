package labassignment3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" How much water Alice is taking: ");
		double water=sc.nextDouble();
		if (water>=5000)
		{
			System.out.println(" YES, Alice is following doctor's advice");
		}
		else
		{
			System.out.println(" NO, Alice is not following doctor's advice");
		}

	}

}
