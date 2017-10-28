package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int size = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[size];
            for(int i=0; i<size; i++){
                a[i] = sc.nextInt();
            }
            int flag =0;
            List<Integer> arr = new ArrayList<Integer>();
            for(int i=0; i<size; i++){
                if(a[i]<n){
                    int len = (Integer.toString(a[i])).length();
                    int b[] = new int[len];
                    for(int j=0; j<len; j++){
                        b[j] = Integer.parseInt(String.valueOf((Integer.toString(a[i])).charAt(j)));
                    }
                    System.out.println(Arrays.toString(b));
                    if(b.length==1){
                        flag = 1;
                    } else {
                        for(int k=0; k<len-1; k++){
                            System.out.println(b[k] + " " + b[k+1]);
                            if(Math.abs(b[k]-b[k+1])==1){
                                flag = 1;
                            } else {
                                flag = 0;
                                break;
                            }
                        }
                    }

                    if(flag==1){
                        arr.add(a[i]);
                    }
                }
            }
            System.out.println();
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println();
            testCases--;
        }
    }
}
