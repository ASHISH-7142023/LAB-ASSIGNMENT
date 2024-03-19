 package labassignment3;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Computer_Guess=(int)((Math.random()*(9-1+1)) +1);
		Scanner sc=new Scanner(System.in);
		System.out.println(" Guess A No. In B/w 1 To 9 : ");
		int User_guess=sc.nextInt();
		System.out.println(" User_guess "+User_guess);
		System.out.println(" Computer_guess "+Computer_Guess);
		if(Computer_Guess==User_guess)
		{
			System.out.println(" U Got It Right");
		}
		else if(User_guess==(Computer_Guess+1)|| User_guess==(Computer_Guess-1))
		{
			System.out.println(" Almost Got It ");
		}
		else
		{
			System.out.println(" U Got It Wrong ");
		}	

	}

}
