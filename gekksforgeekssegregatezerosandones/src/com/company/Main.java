package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int size = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            int b[] = new int[size];
            int count = 0;
            int flag = 0;
            while(count<2){
                for(int i=0; i<size; i++){
                    System.out.println("a[i]: " + a[i] + " count: " + count + " flag: " + flag);
                    if(a[i]==count){
                        b[flag] = a[i];
                        flag++;
                    }
                    if(i==size-1){
                        count++;
                    }
                }
            }
            for(int i=0; i<size; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            test--;
        }
    }
}
