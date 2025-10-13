package basicMaths;

import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisors {

    public static void printAllDivisors(int num){

        ArrayList<Integer> ansList = new ArrayList<>();

        // BRUTE FORCE :: Iterate from 1 to N and check if its divide the num completely
        // TC : O(N)
//        for(int i=1; i<=num; i++){
//            if(num % i == 0){
//                ansList.add(i);
//            }
//        }
//
        // OPTIMISED APPROACH
        // Loop till square root of the number and check the division.
        // TC : O(sqrt(N))

        for(int i=1; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                ansList.add(i);
                // condition to avoid duplication of elements
                if(num/i != i){
                    ansList.add(num/i);
                }
            }
        }
        ansList.sort(null);
        ansList.stream().forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        printAllDivisors(num);
    }
}

