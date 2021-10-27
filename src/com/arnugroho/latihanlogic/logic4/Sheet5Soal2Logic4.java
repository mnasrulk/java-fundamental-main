package com.arnugroho.latihanlogic.logic4;
import java.util.*;

public class Sheet5Soal2Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n1: ");
        int n1 = sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.println("Masukkan nilai n2: ");
        int n2 = cs.nextInt();
        char[] pattern = new char [n1];
        for (int i=0; i<n1; i++){
            pattern[i] = '*';
            for (int h=0; h<n2; h++)
                if (h%2==0)
                    for (char item: pattern) {
                        System.out.print(item);
                    }
                else {
                    for (int j=0;j<n1; j++)
                        System.out.print(pattern[n1-j-1]);
                }
                System.out.println();
        }
    }
}
