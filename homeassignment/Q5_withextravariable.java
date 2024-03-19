package homeassignment;

public class Q5_withextravariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=1;
		int A=4;
		int K=3;
		int G=2;
		int B=0;
		System.out.println("Before Swap : ");
		System.out.println("W "+W+" A "+A+" K "+K+" G "+G);
		B=W; W=A; A=K; K=G; G=B;
		System.out.println("After Swap : ");
		System.out.println("W "+W+" A "+A+" K "+K+" G "+G);
		}
	

}
