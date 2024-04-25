package labassignment7;
import java.util.Scanner;
public class Q7 {
	 public static int toOctal(int dec)
	 {
		 int octal = 0, placeValue = 1;
	     while (dec != 0)
	     {
	    	 octal += (dec % 8) * placeValue;
	         placeValue *= 10;
	         dec /= 8;
	     }
	     return octal;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int n = scanner.nextInt();
        int octal = toOctal(n);
        System.out.println("Octal representation: " + octal);
        scanner.close();

	}

}
