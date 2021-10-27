package com.arnugroho.latihanlogic.logic2;

import java.util.Arrays;
import java.util.Scanner;

public class SoalNo3Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        for(int i=0; i<n; i++){
            Arrays.fill(pattern, -100);
            pattern[n-i-1] = 16-2*i;
            pattern[i] = 2*i+1;
            for(int item: pattern){
                if(item!=-100)
                    System.out.print(item);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
