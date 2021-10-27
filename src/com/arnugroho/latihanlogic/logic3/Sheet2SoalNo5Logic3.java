package com.arnugroho.latihanlogic.logic3;

import java.util.Scanner;
public class Sheet2SoalNo5Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int[] pattern = new int [n];
        int[][] pattern2 = new int [(n-1)/2+1][n];
        int val1 = 0, val2 = 0, sum = 0;
        for (int k=0; k<pattern.length;k++){
            if (k == 0)
                sum = 1;
            else if (k<=(n-1)/2)
                sum = val1 + val2;
            else
                sum = pattern[n-k-1];
            pattern[k] = sum;
            val2=val1;
            val1=sum;
        }
        for (int i=0; i<=(n-1)/2;i++){
            for (int j=0; j<i;j++)
                pattern[j] = 0;
            for (int m=0; m<n; m++){
                pattern2[i][m] = pattern [m];
                if (pattern[m]!=0)
                    System.out.print(pattern[m]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0; i<(n-1)/2; i++){
            for (int j=0; j<n;j++){
                if (pattern2[(n-1)/2-i-1][j]!=0)
                    System.out.print(pattern2[(n-1)/2-i-1][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
