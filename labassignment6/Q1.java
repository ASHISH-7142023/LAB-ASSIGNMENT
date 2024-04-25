package labassignment6;
public class Q1 {
public static int additionSimple(int x, int y)
{
	return x + y;
}
public static int subtractionSimple(int x, int y) 
{
	return x - y;
}
public static int multiplicationSimple(int x, int y)
{
	return y == 0 ? -1 : x * y;
}
public static double divisionSimple(int x, int y)
{
    return (double) x / y;
}
public static int remainderSimple(int n, int m)
{
    return n % m;
}
public static double squareRootSimple(int n)
{
    return n < 0 ? -1 : Math.sqrt(n);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=additionSimple(2,3);
		System.out.println("the add of 2 integers is"+additionSimple(2,3));
		int d=subtractionSimple(2,3);
		System.out.println("the subtract of 2 integers is"+subtractionSimple(2,3));
		int c=multiplicationSimple(2,3);
		System.out.println("to multiply of 2 integers is"+multiplicationSimple( 2 , 3 ));
		System.out.println("to double divide of 2 integers is"+ divisionSimple( 3 , 3 ));
		System.out.println("the remainder of 2 integers is"+remainderSimple( 2 , 3 ));

	}

}
