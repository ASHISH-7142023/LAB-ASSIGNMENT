package labassignment3;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		double x=sc.nextDouble();
		int g=(x<=100&&x>=90)?1:(x<90&&x>=80)?2:(x<80&&x>=70)?3:(x<70&&x>=60)?4:(x<60&&x>=50)?5:(x<50&&x>=40)?6:(x<40&&x>=0)?7:8;
		switch(g) {
		case 1:
			System.out.println("O");
		break;
		case 2:
			System.out.println("A");
		break;
		case 3:
			System.out.println("B");
		break;
		case 4:
			System.out.println("C");
		break;
		case 5:
			System.out.println("D");
		break;
		case 6:
			System.out.println("E");
		break;
		case 7:
			System.out.println("F");
		break;
		default:
			System.out.println("Invalid input!!");
		}
		sc.close();
		
	}

}
