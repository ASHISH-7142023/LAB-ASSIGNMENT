package labassignment2;
import java.util.Scanner;
public class Q5 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the hemisphere :");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double Surface_Area = 3*Math.PI*radius*radius;
		double Volume = (2/3.0)*Math.PI*Math.pow(radius,3);
		System.out.println("Enter the surface area of the hemisphere "+Surface_Area);
		System.out.println("Enter the volume area the hemisphere "+Volume);
		
		
	}

}
