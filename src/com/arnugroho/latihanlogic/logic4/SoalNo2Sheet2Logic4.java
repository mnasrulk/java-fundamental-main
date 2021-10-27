package com.arnugroho.latihanlogic.logic4;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo2Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n=sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.println("Masukkan Nilai n2: ");
        int n2=cs.nextInt();

        int[] pattern = new int [n2];
        for (int i=0; i<n; i++){
            Arrays.fill(pattern, 0);
            for (int j=0; j<=n2-(i*2+1);j++){
                pattern[j+i] = j+1;
            }
            for (int j=0; j<n2; j++){
                if(pattern[j]!=0)
                    System.out.print(pattern[j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
