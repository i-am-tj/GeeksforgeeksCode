package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases>0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i);
            System.out.println(j);
            sc.nextLine();
            int a[][] = new int[i][j];
            for(int x=0; x<i; x++){
                for(int y=0; y<j; y++){
                    a[x][y] = sc.nextInt();
                    System.out.println("x: " + x + " y: " + y + " a[x][y]: " + a[x][y]);
                }

            }
            sc.nextLine();
            System.out.println("Here");
            for(int x=0; x<i; x++){
                for(int y=0; y<j; y++){
                    System.out.println(a[x][y]);;
                }
            }
            int sum = 0;
            for(int x=0; x<i; x++){
                for(int y=0; y<j; y++){
                    sum += a[x][y];
                }
            }
            System.out.println("Sum: " + sum);
            testCases--;
        }
    }
}
