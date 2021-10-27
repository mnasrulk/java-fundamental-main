package com.arnugroho.latihanlogic.logic2;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo6Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        Arrays.fill(pattern, -100);
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                pattern[n-j] = 16-(i-1)*2;
            }
            for (int item:pattern){
                if(item!=-100)
                    System.out.print(item);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
