package com.arnugroho.latihanlogic.logic3;
import java.util.*;

public class Sheet2SoalNo7Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int[] pattern = new int [n];
        for (int i=0; i<n; i++){
            Arrays.fill(pattern, 1);
            if (i>=(n-1)/4 && i<n-2) {
                for (int j=0; j<(n-2)/2+1; j++){
                    pattern[j+(n-1)/4] = 2;
                }
            }
            if (i>(n-1)/4 && i<n-3) {
                for (int j=0; j<(n-1)/2-1; j++){
                    pattern[j+(n-1)/4+1] = 3;
                }
            }
            if (i==(n-1)/2)
                pattern[i] = 1;
            for (int item:pattern)
                System.out.print(item);

            System.out.println();
        }
    }
}
