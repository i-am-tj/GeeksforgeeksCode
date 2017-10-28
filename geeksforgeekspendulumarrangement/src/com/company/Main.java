package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int size = sc.nextInt();
            int a[] = new int[size];

            //Getiing input in array
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            int temp=0;

            //Sorting the array in ascending order
            for(int i=0; i<size-1; i++){
                for(int j=i+1; j<size; j++){
                    if(a[j]<a[i]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            //Getting a new array to put the values accordingly
            int b[] = new int[size];

            int count = 0;
            int side = 0;
            int middle = size/2;
            int mid = 0;

            //Getting the pivot element
            if(size%2==0){
                mid = middle - 1;
            } else {
                mid = middle;
            }

            //Aligning the numbers in array in reqd fashion
            for (int i = 0; i<size; i++){
                if(count%2==0){
                    b[mid - side] = a[i];
                    mid = mid - side;
                } else {
                    b[mid + side] = a[i];
                    mid = mid + side;
                }
                side++;
                count++;
            }

            //Printing the array
            for(int i=0; i<size; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            test--;
        }
    }
}
