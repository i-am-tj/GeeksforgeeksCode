package com.company;

import java.util.Scanner;

public class Main {

    static int factorial(int n){
        int fact = 1;
        if(n==1){
            return 1;
        } else {
            for(int i = n; i>0; i--){
                fact = n * factorial(n-1);
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                System.out.println("Enter number to be checked: ");
                int num = sc.nextInt();
                int countOfDigits = (int)(Math.log10(num)+1);
                System.out.println("Number of digits: "  + countOfDigits);
                String number = Integer.toString(num);
                int count = 0;
                for(int i=0; i<countOfDigits; i++){
                    int x = Integer.parseInt(number.valueOf(number.charAt(i)));
                    System.out.println("Value at position " + i + " is x: " + x);
                    count += factorial(x);
                }
                if(count == num){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                testCases--;
            }
        }
    }
}
