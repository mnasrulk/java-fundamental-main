package com.arnugroho.latihanlogic.logic3;
import java.util.*;

public class Sheet2SoalNo8Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int[] pattern = new int [n];
        for (int i=0; i<n; i++){
            if (i==0 || i==n-1)
                Arrays.fill(pattern, 1);
            else {
                if (i==2 || i==6){
                    Arrays.fill(pattern, 3);
                    pattern[1] = 0;
                    pattern[n-2] = 0;
                }
                else
                    Arrays.fill(pattern, 0);
                pattern[0] = 1;
                pattern[n-1] = 1;
                if (i!=1 && i!=n-2){
                    pattern[2] = 3;
                    pattern[n-3] = 3;
                }
                if (i==(n-1)/2)
                    pattern[i] = 5;
            }
            for (int item: pattern){
                if (item!=0)
                    System.out.print(item);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
