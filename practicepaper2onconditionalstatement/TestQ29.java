package practicepaper2onconditionalstatement;

public class TestQ29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 25;
		if (++x < (y = y -= 4) || (x = x += 4) > y)
		{
			System.out.println(x + "," + y);
		}

	}

}
