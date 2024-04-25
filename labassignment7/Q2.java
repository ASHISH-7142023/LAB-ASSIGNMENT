package labassignment7;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        System.out.print("Enter the integers between 1 and 100: ");
        int in;
        while ((in = sc.nextInt()) != 0) {
            if (in >= 1 && in <= 100) arr[in]++;
            else System.out.println("Enter integer in range of 1 to 100.");
        }

        for (int i = 1; i <= 100; i++) {
            if (arr[i] > 0)
                System.out.println(i + " occurs " + arr[i] + " time" + ((arr[i] > 1) ? "s" : ""));
        }

        sc.close();

	}

}
