package labassignment7;
import java.util.Scanner;
public class Q5 {
	private static int findSecondLargest(int[] array)
	{
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : array)
        {
            if (i > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = i;
            }
            else if (i > secondLargest && i < firstLargest)
            {
                secondLargest = i;
            }
        }
        return secondLargest;
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
        System.out.println(findSecondLargest(arr) + " is the second-largest element");
        sc.close();

	}

}
