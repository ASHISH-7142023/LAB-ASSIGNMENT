package labassignment7;
import java.util.Scanner;
public class Q6 {
	private static void reverseArray(int[] arr)
	{
		int i = 0, j = arr.length - 1;
		while (i < j)
		{
			int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
            i++;
            j--;
	    }
	}
	private static void printArray(int[] arr)
	{
		for (int j : arr)
		{
			System.out.print(j + " ");
	    }
	        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter length of the array: ");
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     System.out.print("Enter elements: ");
         for (int i = 0; i < arr.length; i++)
         {
        	 arr[i] = sc.nextInt();
	     }
	     System.out.print("Original array: ");
	     printArray(arr);
	     reverseArray(arr);
	     System.out.print("Reversed array: ");
	     printArray(arr);
	     sc.close();
	
	}

}
