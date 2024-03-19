package homeassignment4;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfSquare = 0, squareOfSum = 0;
	    for (int i = 1; i <= 10; i++)
	    {
	    	sumOfSquare += i * i;
	    	squareOfSum += i;
	    }
	    squareOfSum *= squareOfSum;
	    int difference = squareOfSum - sumOfSquare;
	    System.out.println(difference); // 2640

	}

}
