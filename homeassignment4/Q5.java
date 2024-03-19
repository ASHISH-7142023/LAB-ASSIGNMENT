package homeassignment4;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) row.append(j);
            for (int k = i - 1; k >= 1; k--) row.append(k);
            System.out.println(row);
        }

	}

}
