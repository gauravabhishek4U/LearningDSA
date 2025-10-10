import java.util.Scanner;

public class Palindrome {

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
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int reversedNo = reveseDigits(num);
        if(num == reversedNo)
            System.out.println("It is a palindrome number.");
        else
            System.out.println("No, it is not a palindrome number.");
    }
}
