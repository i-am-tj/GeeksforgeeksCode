package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int count(int x, int y){
        int ans = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int i = 0;
        while(x % y != 0){
            x = x % y;
            ans++;
            if(m.containsValue(x)){
                if(x == m.get(m.size()-1)){
                    return -1;
                }
            }
            m.put(i, x);
            x = x*10;
            i++;
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int res = count(x,y);
            System.out.println(res);
            testCases--;
        }
    }
}
