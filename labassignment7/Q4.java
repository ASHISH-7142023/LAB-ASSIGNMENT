package labassignment7;
import java.util.Scanner;
public class Q4 {
	 public static double min(double[] array)
	 {
	        int n = array.length;
	        double min = array[0];
	        for (int i = 1; i < n; i++)
	        {
	            if (min > array[i])
	                min = array[i];
	        }
	        return min;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter ten nos.: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextDouble();
        }
        System.out.println("The minimum no. is: " + min(arr));
        sc.close();
    
	}

}
