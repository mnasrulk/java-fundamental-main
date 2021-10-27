package com.arnugroho.latihanlogic.logic2;

import java.util.Scanner;

public class SoalNo9Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        for (int i=0; i<=(n-1)/2;i++){
            pattern[i] = i*2+1;
            pattern[n-i-1] = i*2+1;
        }
        for (int i=0; i<n; i++){
            for (int item: pattern){
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
