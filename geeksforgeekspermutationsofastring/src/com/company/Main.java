package com.company;

import java.util.Scanner;

public class Main {

    public static void permute(String str, int l, int r){
        if(l==r){
            System.out.println("l " + l + " r " + r);
            System.out.println(str + " ");
        } else {
            System.out.println("l " + l + " r " + r);
            for(int i=l; i<=r; i++){
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        System.out.println("i " + i + " j " + j);
        System.out.println("Swapped: " + String.valueOf(charArray));
        return String.valueOf(charArray);
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            String inp = sc.next();
            int n = inp.length();
            permute(inp, 0, n-1);
            System.out.println();
            testCases--;
        }
    }
}
