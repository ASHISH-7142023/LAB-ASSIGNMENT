package homeassignment2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the total number of eggs: ");
	     int totalEggs = sc.nextInt();
	     int grossCount = totalEggs / 144;
	     totalEggs %= 144;
	     int dozenCount = totalEggs / 12;
	     totalEggs %= 12;
	     System.out.println("Number of gross eggs: " + grossCount);
	     System.out.println("Number of dozen eggs: " + dozenCount);
	     System.out.println("Number of leftover eggs: " + totalEggs);
	     sc.close();
	        
	}

}
