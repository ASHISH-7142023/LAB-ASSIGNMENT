package labassignment6;
import java.util.Scanner;
public class Q5 {
	  public static double area(int n, double side)
	  {
	        return (n * side * side) / (4  * Math.tan(Math.PI/n));
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.of slides :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(" Enter the length of slides :");
		double side = sc.nextDouble();
		double area = area(n,side);
		System.out.println("area of given polygon is"+area);		

	}

}
