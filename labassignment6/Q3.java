package labassignment6;
import java.util.Scanner;
public class Q3 {
	public static int reverse(int number)
	{
		int reversed = 0;
        while (number != 0)
        {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
	}
    public static boolean isPalindrome (int number)
    {
        return number == reverse(number);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = sc.nextInt();
	        if (isPalindrome(n)) 
	        	System.out.println(n + " is a palindrome");
	        else
	        	System.out.println(n + " is not a palindrome");

	        sc.close();
	    }

}
