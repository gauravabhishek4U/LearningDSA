package basicMaths;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        int count = 0;

        // BRUTE FORCE : Count how many numbers divide it
        // TC : O(N)
//        for(int i=1; i<=num; i++){
//            if(num % i ==0){
//                count++;
//            }
//        }

        // OPTIMISED APPROACH
        // Loop till square root of the number and check the division.
        // TC : O(sqrt(N))

        for(int i=1; i<= Math.sqrt(num); i++){
            if(num%i == 0){
                count++;
                if(num/i != i){
                    count++;
                }
            }
        }

        if(count == 2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
