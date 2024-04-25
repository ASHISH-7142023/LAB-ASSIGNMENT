 package labassignment5;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of term : ");
		int n=sc.nextInt();
		int FN=0,SN=1,TN=1,result=0;
		System.out.println("The series : "+FN+" "+SN+" "+TN+" ");
		for(int i=0;i<=n-3;i++)
		{
			result=FN+SN+TN;
			System.out.println(result+" ");
			FN=SN;
			SN=TN;
			TN=result;
		}

	}

}
