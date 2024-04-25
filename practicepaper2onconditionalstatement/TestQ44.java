package practicepaper2onconditionalstatement;

public class TestQ44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x='A';
		switch(x)
		{
		case 5: x+= 5;
		case 97: x+=10;
		case 98: x+=15;
		break;
		case 99: x+=20;
		}
		System.out.println(x);

	}

}
