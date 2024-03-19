package homeassignmentcommandlineargument;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = Integer.parseInt(args[0]);
	      int firstDigit = n / 1000;
	      int lastDigit = n % 10;
	      int sum = firstDigit + lastDigit;
	      System.out.println(sum);

	}

}
