package practicepaper3onlooping;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		while(true)
		{
			if(count > 4)
				break;
			if(count==0)
			{
				count++;
			}
			System.out.print(count + ",");
			count++;
		}

	}

}
