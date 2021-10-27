package com.arnugroho.latihanlogic.logic2;

import java.util.Scanner;

public class SoalNo5Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        for(int i=0;i<n;i++){
            pattern[i] = 2*i+1;
            for(int item:pattern){
                if (item!=0)
                    System.out.print(item);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
