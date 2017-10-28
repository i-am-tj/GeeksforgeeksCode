package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int testCases = sc.nextInt();
            while(testCases>0){
                if(testCases>200){
                    break;
                } else {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    if(n>0 && n<=100 && m>0 && m<=100){

                        int a[][] = new int[n][m];
                        int count[] = new int[n];

                        //Adding elements into array

                        for(int i=0; i<n; i++){
                            for(int j=0; j<m; j++){
                                int x = sc.nextInt();
                                if(x==0 || x==1){
                                    a[i][j] = x;
                                }
                            }
                        }

                        //Initializing count to 0

                        for(int i=0;i<n;i++){
                            count[i]=0;
                        }

                        //Searching for count and increasing value if 1

                        for(int i=0; i<n; i++){
                            for(int j=0; j<m; j++){
                                if(a[i][j]==1){
                                    count[i] += 1;
                                }
                            }
                        }


                        int y = 101;
                        int flag = 0;
                        int index = 0;

                        //Checking values in count array and altering index as well as value of y

                        for(int i=0; i<n; i++){
                            if(count[i]==0){
                                flag -= 1;
                            }else if(count[i]<y){
                                index = i;
                                y = count[i];
                            } else if(count[i]==y){
                                continue;
                            }
                        }

                        //Output

                        if(flag==-n){
                            System.out.println(-1);
                        } else {
                            System.out.println(index);
                        }
                    }
                }
                testCases--;
            }
        }
    }
}
