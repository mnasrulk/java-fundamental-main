package com.arnugroho.latihanlogic.logic2;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo10Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        for (int i=0; i<=(n-1)/2; i++){
            Arrays.fill(pattern, i*2);
            for (int item: pattern)
                System.out.print(item);
            System.out.println();
        }
        for (int i =0;i<(n-1)/2;i++){
            Arrays.fill(pattern, 6-i*2);
            for (int item: pattern)
                System.out.print(item);
            System.out.println();
        }
    }
}
