package homeassignmentcommandlineargument;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double SA = Math.PI * (Math.pow(r, 2) + (2 * r * h));
        System.out.println(SA);

	}

}
