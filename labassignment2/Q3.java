package labassignment2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the basic salary :");
		Scanner sc = new Scanner(System.in);
		int salary= sc.nextInt();
		double DA = salary*0.4;
		double HRA = salary*0.2;
		double Gross = salary+DA+HRA;
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("Gross salary is "+Gross);
		

	}

}
