package basicMaths;

import java.util.*;

public class CountDigits {
    // Brute-Force
    // Time Complexity: O(log10N + 1) where N is the input number.
    // The time complexity is determined by the number of digits in the input integer N.
    // In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.
    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            count = count+1;
            num = num/10;
            System.out.println(num);
        }
        return count;
    }

    // Optimal Approach
    //Time Complexity: O(1)as simple arithmetic operations in constant time are computed on integers.
    public static int digitCount(int num){
        int count;
        count = (int) (Math.log10(num)+1);
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Counting the digits.....");
        int digits = countDigits(num);
        System.out.println("The number of digits : "+digits);

    }

}
