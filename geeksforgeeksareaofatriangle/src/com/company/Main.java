package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

    private static DecimalFormat df = new DecimalFormat("0.000000");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int x = a+b;
                int y = b+c;
                int z = c+a;

                if((x>c)||(y>b)||(z>a)){
                    String s = df.format((double)(a+b+c)/2);
                    System.out.println(s);
                    double S = Double.parseDouble(s);
                    double ar = Math.sqrt(S*(S-a)*(S-b)*(S-c));
                    System.out.println(ar);
                    String area = df.format(Math.sqrt(S*(S-a)*(S-b)*(S-c)));
                    System.out.println(area);
                } else {
                    System.out.println(df.format(0));
                }
                testCases--;
            }
        }
    }
}