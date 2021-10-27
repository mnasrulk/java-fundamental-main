package com.arnugroho.latihanlogic.logic4;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo5Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner cs=new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = cs.nextInt();
        System.out.println("Masukkan nilai n: ");
        System.out.println("Masukkan nilai n2: ");
        char[] pattern = new char [n2];
        for(int i=0; i<n;i++){
            Arrays.fill(pattern, ' ');
            for(int j=0;j<=n2-(i*2+1);j++){
                pattern[j+i] = (char)(j+65);
            }
            for(int j=0; j<n2; j++){
                System.out.print(pattern[j]);
            }
            System.out.println();
        }
    }
}
