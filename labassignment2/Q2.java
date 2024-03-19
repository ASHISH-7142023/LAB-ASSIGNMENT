package labassignment2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the distance in km :");
		Scanner sc = new Scanner(System.in);
		int km= sc.nextInt();
		double meter = km*1000;
		double feet = 3280.8399*km;
		double inch = 39370.0787*km;
		double centimeter = 100000;
		System.out.println(km+" km is "+meter+" meters");
		System.out.println(km+" km is "+feet+" feet");
		System.out.println(km+" km is "+inch+" inch");
		System.out.println(km+" km is "+centimeter+" centimeters");
		

	}

}
