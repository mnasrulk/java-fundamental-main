package com.arnugroho.j4_latihan01;

import java.util.Scanner;

public class Lat1Method {
    public static void deretGanjil(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 1);
        }
    }

    public static void deretGenap(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Masukkan nomor:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println("--------------------");
        deretGanjil(n);
        System.out.println("\n");
        deretGenap(n);
    }
}
