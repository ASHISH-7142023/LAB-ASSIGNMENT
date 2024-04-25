package practicepaper3onlooping;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, s = 0;
		for (int k = 0; k < 5; k++)
		{
			i = 0;
			do
			{
				i++; s++;
			}
			while (i < k);
		}
		System.out.println(s);
		

	}

}
