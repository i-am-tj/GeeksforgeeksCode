package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                int size = sc.nextInt();
                int a[] = new int[size];

                //Taking input
                for(int i=0; i<size; i++){
                    a[i] = sc.nextInt();
                }

                //Sorting the whole array in ascending order
                int t;
                for(int i=0; i<size-1; i++){
                    for(int j=i+1; j<size; j++){
                        if(a[j]<=a[i]){
                            t = a[i];
                            a[i] = a[j];
                            a[j] = t;

                        }
                    }
                }

                //finding the smallest and second smallest out of the array
                int min = a[0];
                int smin = a[0];
                for(int i=1; i<size; i++){
                    if(a[i]>min){
                        smin = a[i];
                        break;
                    } else {
                        continue;
                    }
                }

                //checking whether they are same
                if(min == smin){
                    System.out.println(-1);
                } else {
                    System.out.println(min + " " + smin);
                }

                testCases--;
            }
        }
    }
}
