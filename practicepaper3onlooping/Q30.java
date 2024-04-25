package practicepaper3onlooping;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1;
		for ( ; ; )
		{
			if (i > 5)
				break;
			else
				j += i ;
			System.out.println(j);
			i += j;
		}

	}

}
