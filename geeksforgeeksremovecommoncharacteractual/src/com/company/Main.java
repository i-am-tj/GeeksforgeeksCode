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
            String a = sc.next();
            String b = sc.next();
            int len1 = a.length();
            int len2 = b.length();
            int flag = 0;
            Set<Character> set = new LinkedHashSet<Character>();
            char arr1[] = a.toCharArray();
            char arr2[] = b.toCharArray();

            for(int i=0; i<len1; i++){
                for(int j=0; j<len2; j++){
                    if((String.valueOf(arr1[i])).equals(String.valueOf(arr2[j]))){
                        set.add(Character.valueOf(arr1[i]));
                    }
                }
            }
            Character arr[] = new Character[set.size()];
            set.toArray(arr);
            //System.out.println(Arrays.toString(set.toArray(arr)));
            for(int i=0; i<len1; i++){
                for(int j=0; j<arr.length; j++){
                    if((String.valueOf(arr1[i])).contains(String.valueOf(arr[j]))){
                        arr1[i] = '\0';
                    }
                }
            }
            for(int i=0; i<len2; i++){
                for(int j=0; j<arr.length; j++){
                    if((String.valueOf(arr2[i])).contains(String.valueOf(arr[j]))){
                        arr2[i] = '\0';
                    }
                }
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            String s = "";
            for(int i=0; i<len1; i++){
                if(arr1[i]!='\0'){
                    s += String.valueOf(arr1[i]);
                }
            }
            for(int j=0; j<len2; j++){
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
