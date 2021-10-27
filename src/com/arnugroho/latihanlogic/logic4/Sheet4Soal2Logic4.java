package com.arnugroho.latihanlogic.logic4;

import java.util.*;
public class Sheet4Soal2Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan nilai n: ");
        int n = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Masukkan nilai dimensi: ");
        int dimen = sc2.nextInt();
        int numStar=1;
        char[] pattern = new char [dimen];
        int space = 0;

        for (int i=0; i<n; i++){
            for (int h=0; h<numStar; h++){
                Arrays.fill(pattern, ' ');
                for (int j=1; j<numStar; j++){
                    pattern[space+j-1] = '*';
                }
                for (char item:pattern)
                    System.out.print(item);
                System.out.println();
            }
            space+=numStar;
            numStar++;
        }
    }
}
