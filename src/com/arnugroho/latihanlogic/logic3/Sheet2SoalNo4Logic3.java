package com.arnugroho.latihanlogic.logic3;

import java.util.Scanner;
public class Sheet2SoalNo4Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int val1 = 0, val2 = 0, val3 = 0, sum = 0;
        int[] pattern = new int [(n-1)/2+1];
        for (int i=0; i<=(n-1)/2;i++)
        {
            if (i<3)
                sum=1;
            else
                sum = val1+val2+val3;
            pattern[(n-1)/2-i] = sum;
            System.out.print(sum + " ");
            val3 = val2;
            val2 = val1;
            val1 = sum;
        }
        for (int i=0; i<pattern.length-1; i++){
            System.out.print(pattern[i+1]+" ");
        }
    }
}
