package labassignment2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a degree in Fahrenheit:");
		Scanner sc = new Scanner(System.in);
		int Fah= sc.nextInt();
		double Celsius = (Fah-32)*(5.0/9);
		System.out.print(Fah+" Fahrenheit is "+Celsius+" Celsius");
	}

}
