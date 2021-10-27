package com.arnugroho.latihanlogic.logic3;
import java.util.*;
public class Sheet2SoalNo6Logic3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        String[] pattern = new String [n];
        int val1 = 0, val2 = 0, sum = 0;
        int[] series = new int [n];

        for(int i=0; i<n; i++){
            if(i==0)
                sum = 1;
            else
                sum=val1+val2;
            series[i] = sum;
            val2 = val1;
            val1 = sum;
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++)
                pattern[j] = "D";
            for (int w=i+1; w<n-1-(i*2);w++)
                pattern[w] = "A";
            for (int j=0; j<i; j++)
                pattern[n-j-1] = "B";
            for (int j=n-i; j<=i; j++)
                pattern[j] = "C";

            pattern[i] = Integer.toString(series[i]);
            pattern[n-i-1] = Integer.toString(series[n-i-1]);
            for (String item:pattern)
                System.out.print(item);
            System.out.println();
        }
    }
}
