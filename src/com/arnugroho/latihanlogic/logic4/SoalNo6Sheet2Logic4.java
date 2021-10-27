package com.arnugroho.latihanlogic.logic4;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo6Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner cs=new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        System.out.println("Masukkan nilai n2:");
        int n=sc.nextInt();
        int n2=cs.nextInt();
        int[] pattern = new int [n2];
        int[] series = new int [n2];
        for (int i=0; i<n2;i++)
            series[i] = i*2+1;
        for (int i=0; i<n; i++){
            Arrays.fill(pattern, 0);
            for(int j=0; j<=i; j++){
                pattern[j+(n2-1)/2-i] = series[j];
                if (j!=i)
                    pattern[(n2-1)/2+j+1] = series[i-j-1];
            }
            for (int j=0; j<n2; j++){
                if (pattern[j]!=0)
                    System.out.print(pattern[j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
