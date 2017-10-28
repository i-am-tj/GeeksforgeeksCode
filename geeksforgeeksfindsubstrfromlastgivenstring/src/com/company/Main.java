package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            String sub = sc.next();
            String str = sc.next();
            int sublen = sub.length();
            int strlen = str.length();
            int pos = 0;
            boolean find = false;
            for(int i=0; i<=strlen-sublen; i++){
                if(str.regionMatches(i, sub, 0, sublen)){
                    find = true;
                    pos = i+1;
                }
            }
            if(!find){
                System.out.println(-1);
            } else {
                System.out.println(pos);
            }
            testCases--;
        }
    }
}
