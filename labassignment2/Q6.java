package labassignment2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the hemisphere :");
		Scanner sc = new Scanner(System.in);
		double t=sc.nextDouble();
		double d,g;
		g=32.174;
		d=(1/2.0)*g*t*t;
		System.out.println("Distance travelled : "+d);
		

	}

}
