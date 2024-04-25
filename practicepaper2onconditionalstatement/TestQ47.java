package practicepaper2onconditionalstatement;

public class TestQ47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 6.2;
		if(x-- >= 6.0)
		{
			System.out.print("1st ");
		}
		if(--x >= 5.0)
		{
			System.out.print("2nd ");
		}
		if(x-- >= 4.0)
		{
			System.out.print("3rd ");
		}
		else
		{
			System.out.print("4th ");
		}

	}

}
