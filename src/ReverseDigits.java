import java.util.Arrays;
import java.util.Scanner;

// Time Complexity: O(log10N + 1) where N is the input number.
// The time complexity is determined by the number of digits in the input integer N.
// In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.
public class ReverseDigits {
    public static int reveseDigits(int num){
        int ans=0;
        while(num>0){
            int digit =  num%10;
            num = num/10;
            ans = (ans*10) + digit;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int ans = reveseDigits(num);
        System.out.println("The reversed digit is : "+ans);
    }
}
