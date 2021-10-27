package com.arnugroho.latihanlogic.logic4;
import java.util.*;
public class SoalNo9Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n1: ");
        int n1 = sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.print("Masukkan nilai n2:");
        int n2 = cs.nextInt();
        int[] pattern = new int[n1], series = new int [n1];
        int[][] pattern2 = new int [(n1-1)/2+1][n1];
        boolean tgl = true;

        for (int i=0; i<=(n1-1)/2;i++)
            series[i] = i*2+1;

        for(int i=0;i<=(n1-1)/2;i++){
            Arrays.fill(pattern, 0);
            tgl = true;
            for (int j=0; j<=i; j++){
                pattern[j+(n1-1)/2-i] = series[j];
                if (j!=i)
                    pattern[(n1-1)/2+j+1] = series[i-j-1];
            }
            for (int cln=0; cln<n2; cln++){
                for (int j=0; j<n2; j++){
                    if (cln>0 && j==0)
                        System.out.print("");
                    else {
                        if (pattern[j] != 0)
                            System.out.print(pattern[j]);
                        else System.out.print(" ");
                    }
                    if (tgl)
                        pattern2[((n1-1)/2)-i][j] = pattern[j];
                }
                tgl=false;
            }
            System.out.println();
        }
        for (int i=1; i<=(n1-1)/2; i++){
            for (int cln=0; cln<n2; cln++){
                for (int j=0; j<n1; j++){
                    if (cln>0 && j==0)
                        System.out.print("");
                    else {
                        if (pattern2[i][j]!=0)
                            System.out.print(pattern2[i][j]);
                        else
                            System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
