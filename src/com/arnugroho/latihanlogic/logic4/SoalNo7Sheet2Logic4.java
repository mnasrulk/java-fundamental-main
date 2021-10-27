package com.arnugroho.latihanlogic.logic4;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo7Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        System.out.println("Masukkan nilai n2:");
        int n=sc.nextInt();
        int n2= cs.nextInt();
        int[] pattern = new int [n2];
        int[] series = new int[(n2-1)/2+1];
        for (int i=0; i<(n2-1)/2+1;i++)
            series[i] = 2*i+1;
        for (int i=0; i<n; i++){
            Arrays.fill(pattern,0);
            for (int j=0; j<=(n2-1)/2-i; j++){
                pattern[j+i] = series[j];
                if (j!=(n2-1)/2-i)
                    pattern[(n2-1)/2+1+j] = series[series.length-i-2-j];
            }
            for (int item: pattern) {
                if (item!=0)
                    System.out.print(item);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
