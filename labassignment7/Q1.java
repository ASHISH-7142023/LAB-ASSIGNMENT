package labassignment7;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.print("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
			//sum n average
			int sum = 0;
			for(int i=0;i<n;i++)
			{
				sum+=arr[i];
			}
			double avg = (double) sum / n;
	        System.out.println("Sum = "+ sum + "\nAverage = " + avg);
	        sc.close();
	}

}
