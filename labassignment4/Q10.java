package labassignment4;
import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num =sc.nextInt();
		int i=0;
		while(Math.pow(3,i)<=num)
		{
			i++;
		}
		System.out.println("The largest power of 3 less than or equal to "+num+" is "+((int)Math.pow(3, i-1)));

	}

}
