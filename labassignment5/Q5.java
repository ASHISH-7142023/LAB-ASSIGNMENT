package labassignment5;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int idx=2;idx<=15;idx++)
		{
			int mul=0;
			int i=1;
			System.out.println("multiplication table of "+ idx +" is");
			System.out.println(" ");
			while(i<=10)
			{
				mul= idx*i;
				System.out.println(idx+"*"+i+"="+mul);
				i++;
			}
			System.out.println(" ");
		}
	}

}
