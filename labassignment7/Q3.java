package labassignment7;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        int n = sc.nextInt();
        int count = Integer.MIN_VALUE;
        for (int i : arr)
        {
            if (i == n) 
            {
                count++;
            }
        }
        if (count > 0)
            System.out.println(n + " is present " + count + " time" + ((count >= 1) ? "s" : "") + " in the array");
        else
            System.out.println(n + " is not present in the array");
        sc.close();

	}

}
