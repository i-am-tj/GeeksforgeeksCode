package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                String number = sc.next();
                int flag;
                //111111111111111111111111 was not taken by integer input so the number had to be changed to string input
                //int countOfDigits = (int)(Math.log10(numin)+1);
                int countOfDigits = number.length();
                int a[] = new int[countOfDigits];
                //String number = Integer.toString(numin);
                for(int i=0; i<countOfDigits;i++){
                    a[i] = Integer.parseInt(number.valueOf(number.charAt(i)));
                }
                if(a[0]==0){
                    flag = 0;
                } else {
                    flag = 1;
                }
                for(int j=1; j<countOfDigits; j++){
                    if(a[j]==a[j-1]){
                        continue;
                    } else {
                        flag++;
                    }
                }
                if(flag>2){
                    System.out.println("INVALID");
                } else {
                    System.out.println("VALID");
                }
                testCases--;
            }
        }
    }
}
