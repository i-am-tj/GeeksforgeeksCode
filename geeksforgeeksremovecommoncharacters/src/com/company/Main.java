package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){

            //Removing duplicate content from both Strings and then finding common characters and then eliminating

            String a = sc.next();
            String b = sc.next();

            Set<Character> set1 = new LinkedHashSet<Character>();
            Set<Character> set2 = new LinkedHashSet<Character>();

            for(char c:a.toCharArray()){
                set1.add(Character.valueOf(c));
            }
            for(char d:b.toCharArray()){
                set2.add(Character.valueOf(d));
            }

            Character arr1[] = new Character[set1.size()];
            Character arr2[] = new Character[set2.size()];

            set1.toArray(arr1);
            set2.toArray(arr2);

            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!='\0'){
                    for(int j=0; j<arr2.length; j++){
                        if(arr2[j]!='\0'){
                            if(arr1[i].equals(arr2[j])){
                                arr1[i] = '\0';
                                arr2[j] = '\0';
                            }
                        }
                    }
                }
            }

            System.out.println("First Array: " + Arrays.toString(arr1));
            System.out.println("Second Array: " + Arrays.toString(arr2));

            String s = "";
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!='\0'){
                    s += String.valueOf(arr1[i]);
                }
            }
            for(int j=0; j<arr2.length; j++){
                if(arr2[j]!='\0'){
                    s += String.valueOf(arr2[j]);
                }
            }

            if(s.length()!=0){
                System.out.println(s);
            } else {
                System.out.println(-1);
            }

            testCases--;
        }
    }
}
