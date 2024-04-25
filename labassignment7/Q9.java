package labassignment7;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        double[] arr = new double[10];
	        System.out.print("Enter ten numbers: ");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextDouble();
	        }

	        System.out.println("The mean is: " + mean(arr));
	        System.out.println("The standard deviation is: " + deviation(arr));
	        sc.close();
	    }

	    public static double mean(double[] x) {
	        int n = x.length;
	        double mean = 0;
	        for (double v : x) {
	            mean += v;
	        }
	        return mean / n;
	    }

	    public static double deviation(double[] x) {
	        int n = x.length;
	        double sumOfSq = 0, mean = mean(x);
	        for (double v : x) {
	            sumOfSq += Math.pow(v - mean, 2);
	        }
	        return Math.sqrt(sumOfSq / n);
	    }

}
