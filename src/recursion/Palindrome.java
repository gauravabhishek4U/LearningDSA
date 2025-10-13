package recursion;

public class Palindrome {

    public static boolean isPalindrome(int i, String str){

        // Base Condition
        // If i exceeds half of the string, means all the elements are compared, we return true.
        if(i >= str.length()/2) return true;

        // If character at left is not equal to character at the right end, it is not palindrome.
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;

        return isPalindrome(i+1,str);

    }

    public static void main(String[] args) {
        String str = "mango";
        System.out.println(isPalindrome(0,str));

    }
}
