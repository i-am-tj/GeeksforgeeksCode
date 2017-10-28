package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                String x = sc.next();
                String y = sc.next();
                String ver = new StringBuffer(x+y).reverse().toString();
                System.out.println(ver);
                testCases--;
            }
        }
    }
}
