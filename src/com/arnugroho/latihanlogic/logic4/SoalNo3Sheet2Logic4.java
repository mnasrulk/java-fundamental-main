package com.arnugroho.latihanlogic.logic4;
import java.util.Arrays;
import java.util.Scanner;
public class SoalNo3Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        int[][] pattern2 = new int [(n-1)/2+1][n];

        for(int i=0; i<=(n-1)/2; i++){
            Arrays.fill(pattern, 0);
            for(int j=0; j<i*2+1; j++){
                pattern[j+(n-1)/2-i] = j+1;
            }
            for (int j=0; j<n; j++){
                if (pattern[j]!=0){
                    System.out.print(pattern[j]);
                }
                else
                    System.out.print(" ");
                pattern2[pattern2.length-1-i][j] = pattern[j];
            }
            System.out.println();
        }
        for (int j=1; j< pattern2.length; j++){
            for (int i=0; i<n; i++){
                if(pattern2[j][i]!=0)
                    System.out.print(pattern2[j][i]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
