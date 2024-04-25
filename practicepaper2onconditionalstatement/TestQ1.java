package practicepaper2onconditionalstatement;

public class TestQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		boolean i=true,j=false,k=true;
		if ( i=(j=i=k))
			System.out.println("bye");
		else
			System.out.println("hello");
			System.out.println("hi");
			
	}

}
