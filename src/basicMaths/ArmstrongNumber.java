package basicMaths;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void isArmstrong(int num){
        int sum = 0;
        int orgNum = num;
        int count = String.valueOf(num).length();
        while(num>0){
            int digit = num%10;
            num = num/10;
            sum = (int) (sum + Math.pow(digit, count));
        }
        if(orgNum == sum)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("Not an Armstrong number!!!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        isArmstrong(num);
    }
}
