package previousyearmidsemquestionpaper;

public class Q1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=-4;
		int k=z++ + ++z + ++z;
		System.out.println(z+" "+k);
		int t=--k + k++ + z++;
		int p=t++ -(t%5) + (p=t);
		System.out.println(z+" "+k+" "+t+" "+p);

	}

}
