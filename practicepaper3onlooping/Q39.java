package practicepaper3onlooping;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j;
		for(i=0;i<3;i++)
		{
			for(j=1;j<4;j++)
			{
				i%=j;
				System.out.println(j);
			}
		}
	}

}
