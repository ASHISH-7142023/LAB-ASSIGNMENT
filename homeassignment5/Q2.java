package homeassignment5;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
        for (int i = 1; i <= row; i++)
        {
        for (int j = row - 1; j >= i; j--)
        {
        	System.out.print(" ");
        }
        }
        for (int k = 1; k <= 8; k++)
        {
        	System.out.print("* ");
        }
        System.out.println();
			
	}
}
