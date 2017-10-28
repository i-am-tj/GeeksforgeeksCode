package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int num1 = sc.nextInt();
            int num2 = Integer.parseInt(new StringBuffer(Integer.toString(num1)).reverse().toString());
            int n = 1;
            if(num1==num2){
                System.out.println(num2);
                testCases--;
                continue;
            } else {
                int num3 = num1+num2;
                int flag = 0;
                while(n<6){
                    int num5 = num3;
                    int num4 = Integer.parseInt(new StringBuffer(Integer.toString(num5)).reverse().toString());
                    if(num3==num4){
                        flag = 1;
                        break;
                    } else {
                        num3 = num4 + num3;
                        n++;
                        continue;
                    }
                }
                if(flag==1){
                    System.out.println(num3);
                } else {
                    System.out.println(-1);
                }
            }

            testCases--;
        }
    }
}
