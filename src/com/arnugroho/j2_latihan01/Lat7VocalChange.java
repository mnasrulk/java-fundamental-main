package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat7VocalChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String kalimat = scan.nextLine();
        scan.close();
        String[] formatted = kalimat.split("");
        for (int i = 0; i < formatted.length; i++) {
            if (formatted[i].matches("(?i)[AIUEOaiueo]")) {
                formatted[i] = String.valueOf(i);
            }
        }
        kalimat = String.join("", formatted);
        System.out.println(kalimat);
    }
}
