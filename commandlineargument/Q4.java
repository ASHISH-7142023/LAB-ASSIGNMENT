package commandlineargument;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);
		double t=Double.parseDouble(args[0]);
		double result=Math.cos(5*t)+Math.sin(7*t);
		System.out.print("The result is "+result);

	}

}
