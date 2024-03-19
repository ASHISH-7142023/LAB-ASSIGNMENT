package commandlineargument;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);
		System.out.print(args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int Remainder=a%b;
		int Quoitent=a/b;
		System.out.print("The Remainder is "+Remainder);
		System.out.print("The Quoitent is "+Quoitent);

	}

}
