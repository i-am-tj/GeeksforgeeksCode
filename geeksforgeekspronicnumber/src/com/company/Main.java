package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                if(testCases>100){
                    break;
                } else {
                    int n = sc.nextInt();
                    if(n>0 && n<=1000){
                        for(int i=0;i<=Math.sqrt(n);i++){
                            if(i*(i+1)<=n){
                                System.out.print((i*(i+1)) + " ");
                            }
                        }
                    }
                }
                testCases--;
                System.out.println();
            }
        }
    }
}
