package labassignment6;
import java.util.Locale;
public class Q8 {
	public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isPalindrome("racecar"));// true
	}

}
