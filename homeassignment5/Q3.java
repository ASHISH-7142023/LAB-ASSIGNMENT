package homeassignment5;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

	}

}
