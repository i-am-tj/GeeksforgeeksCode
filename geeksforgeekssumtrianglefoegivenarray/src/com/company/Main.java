package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            while(test>0){
                int size = sc.nextInt();
                int a[] = new int[size];

                //Entering values
                for(int i=0; i<size; i++){
                    a[i] = sc.nextInt();
                }
                int sum = 0;
                int size1 = size;
                int size2 = size;

                //Calculating final array size
                while(size1>0){
                    sum += size1;
                    size1--;
                }

                int sum1 = sum;

                //Initializing the new array with numbers in initial array
                int na[] = new int[sum];
                for(int i=0; i<size; i++){
                    na[i] = a[i];
                }

                int temp =0;

                //Adding and placing at right positions
                while(size>1){
                    int temp1 =0;
                    for(int i = temp1; i<size-1;i++){
                        na[temp+size+i] = na[temp+i] + na[temp+i+1];
                    }
                    temp += size;
                    size--;
                }

                //Printing the right way
                while(size<=size2){
                    for(int i=0; i<size; i++){
                        System.out.print(na[temp + i] + " ");
                    }
                    size++;
                    temp -= size;
                }

                System.out.println();
                test--;
            }
        }
    }
}
