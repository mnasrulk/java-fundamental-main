package com.arnugroho.latihanlogic.logic4;
import java.util.Scanner;
import java.util.Arrays;

public class SoalNo4Sheet2Logic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner cs=new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n=sc.nextInt();
        System.out.println("Masukkan nilai n2: ");
        int n2=cs.nextInt();
        char[] pattern = new char [n2];
        for(int i=0; i<n;i++){
            Arrays.fill(pattern, ' ');
            for(int j=0;j<i*2+1;j++){
                pattern[j+(n2-1)/2-i] = (char)(65+j);
            }
            for(int j=0;j<n2;j++){
                System.out.print(pattern[j]);
            }
            System.out.println();
        }
    }
}
