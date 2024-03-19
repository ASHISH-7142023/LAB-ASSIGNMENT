package commandlineargument;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);
		System.out.print(args[1]);
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[1]);
		int d1=(int)(Math.random()*(max-min+1))+min;
		int d2=(int)(Math.random()*(max-min+1))+min;
		System.out.println(d1);
		System.out.println(d2);
		int sum=d1+d2;
		System.out.println(sum);
		
		

	}

}
