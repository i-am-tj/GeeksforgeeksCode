package com.company;

import java.util.Scanner;

public class Main {

    static String splits(){
        return "-";
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int n = sc.nextInt();
            String output = "";
            for(int i=0; i<n; i++){
                int var = n;
                for(int j=0; j<var*2; j++){
                    if(i==0){
                        if(j<n){
                            output += (j+1) + "*";
                        } else {
                            if(j==var*2-1){
                                output += (n*n)+1+(j-var);
                            } else {
                                output += (n*n)+1+(j-var)+"*";
                            }
                        }
                    } else {
                        if(j==0){
                            output += "\n"+splits();
                        } else if(j<i*2) {
                            output += splits();
                        } else {
                            if(j<n)
                                if(j==var*2-1){
                                    output += 1;
                                } else {
                                    output += 1+"*";
                                }
                        }
                    }
                }
            }
            System.out.println(output);
            testCases--;
        }
    }
}
