package com.arnugroho.latihanlogic.logic4;
import java.util.*;

public class SoalNo10Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("masukkan nilai n1: ");
        int n1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("masukkan nilai n2: ");
        int n2 = scan2.nextInt();
        char[] pattern = new char[n1], series = new char [n1];
        char[][] pattern2 = new char [(n1-1)/2+1][n1];
        boolean flag = true;
        for (int i=0; i<=(n1-1)/2; i++)
            series[i] = (char)(65*i);

        for (int i=0; i<=(n1-1)/2;i++){
            Arrays.fill(pattern, ' ');
            flag= true;
            for (int j=0; j<=i; j++){
                pattern[j+(n1-1)/2-i] = series[j];
                if (j!=i)
                    pattern[(n1-1)/2+j+1] = series[i-j-1];
            }
            for (int cln=0; cln<n2; cln++){
                for (int j=0; j<n1; j++){
                    if (cln>0 && j==0)
                        System.out.print("");
                    else
                        System.out.print(pattern[j]);
                    if (flag)
                        pattern2[((n1-1)/2)-i][j] = pattern[j];
                }
                flag= false;
            }
            System.out.println();
        }
        for (int i=1; i<=(n1-1)/2;i++){
            for (int cln=0; cln<n2; cln++){
                for (int j=0; j<n1; j++){
                    if (cln>0 && j==0)
                        System.out.print("");
                    else
                        System.out.print(pattern2[i][j]);
                }
            }
            System.out.println();
        }
    }
}
