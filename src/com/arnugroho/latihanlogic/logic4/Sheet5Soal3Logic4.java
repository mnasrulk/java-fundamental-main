package com.arnugroho.latihanlogic.logic4;
import java.util.*;

public class Sheet5Soal3Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n1: ");
        int n1 = sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.println("Masukkan nilai n2: ");
        int n2 = cs.nextInt();
        char[][] pattern;
        pattern = new char [n1][n1];
        for (int i=0; i<n1; i++){
            for (int j=0; j<i;j++){
                pattern[i][j] = '*';
            }
        }
        for (int i=0; i<n1; i++){
            for (int loop=0; loop<n2; loop++){
                for (int j=0; j<n1; j++){
                    if (loop%2==0){
                        System.out.print(pattern[i][j]);
                    }
                    else
                        System.out.print(pattern[n1-i-1][n1-j-1]);
                }
            }
            System.out.println();
        }
    }
}
