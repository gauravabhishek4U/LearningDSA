package recursion;

import java.util.Scanner;

public class NaturalNoSum {

    public static int sumOfNaturalNumber(int num){
        if(num==0){
            return 0;
        }
        return num + sumOfNaturalNumber(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num = ");
        int num = sc.nextInt();
        System.out.println(sumOfNaturalNumber(num));
    }
}
