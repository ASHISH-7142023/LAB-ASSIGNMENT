package commandlineargument;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);
		System.out.print(args[1]);
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[1]);
		int max1=Math.max(2,4);
		int max2=Math.max(max1,6);
		int min1=Math.min(2,4);
		int min2=Math.min(min1,6);
		int Middle_value=(2+4+6-max-min);
		System.out.println("The ascending order is"+min+" "+Middle_value+" "+max);
		
		

	}

}
