package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int size = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            int k;
            for(int i=0; i<size-1; i++){
                for(int j=i+1; j<size; j++){
                    if(a[i]>a[j]){
                        k = a[i];
                        a[i] = a[j];
                        a[j] = k;
                    }
                }
            }
            int n = a.length;
            System.out.println(a[(n-1)/2]);
            test--;
        }
    }
}
