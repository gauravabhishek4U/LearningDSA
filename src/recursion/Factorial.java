package recursion;

import java.util.Scanner;

public class Factorial {

    public static int calFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num * calFactorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num  = ");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Kindly enter a positive number!!!!!!");
        }
        else{
            System.out.println(calFactorial(num));
        }
    }
}
