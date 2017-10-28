package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
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
                    if(x==0){
                        continue;
                    } else {
                        if(num%x==0){
                            count++;
                        }
                    }
                }
                System.out.println("Count of the number of digits by which it is divisible: " + count);
                testCases--;
            }
        }
    }
}
