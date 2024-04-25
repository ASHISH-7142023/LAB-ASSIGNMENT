package labassignment5;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Nos.:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(" The prime nos. in b/w "+n1+" & "+n2+" are ");
		for (int j=n1;j<=n2;j++)
		{
			int c1=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					c1=c1+1;		
				}
			}
			if(c1==2)
			{
				System.out.print(j+" ");
			}
		}

	}

}
