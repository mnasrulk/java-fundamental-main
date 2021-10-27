package com.arnugroho.latihanlogic.logic4;
import java.util.*;

public class Sheet5Soal1Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n1: ");
        int n1 = sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.println("Masukkan nilai n2: ");
        int n2 = sc.nextInt();

        char[] pattern = new char[n1];
        for (int i=0; i<n1; i++){
            pattern[i] = '*';
            for (int h=0;h<n2;h++)
                for (char item:pattern)
                    System.out.print(item);
                System.out.println();
        }
    }
}
