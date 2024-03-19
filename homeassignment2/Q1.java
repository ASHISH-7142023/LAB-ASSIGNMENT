package homeassignment2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of minutes: ");
	     int max = sc.nextInt();
	     int years = max / (24 * 60 * 365);
	     int days = max % (24 * 60 * 365) / (24 * 60);
	     System.out.println(max + " minutes is approximately " + years +" years"+ " and " + days + " days.");
	     sc.close();
	}

}
