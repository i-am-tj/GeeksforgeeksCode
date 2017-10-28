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
                for(int i=0; i<size; i++){
                    a[i] = sc.nextInt();
                }
                int count1 = 0;
                int count2 = -1;

                for(int i=0; i<size; i++){
                    if(a[i]>count1){
                        count1 = a[i];
                    }
                }
                for(int j=0; j<size; j++){
                    if(a[j]>count2 && a[j]<count1){
                        count2 = a[j];
                    }
                }

                System.out.println(count2);

                testCases--;
            }
        }
    }
}
