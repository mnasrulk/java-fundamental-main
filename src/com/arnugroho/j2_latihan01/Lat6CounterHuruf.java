package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat6CounterHuruf {
    public static void main(String[] args) {
        System.out.println("Masukkan Kata: ");
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        scan.close();
        int hitungHuruf = 0;
        int hitungKata = 0;
        char ch[] = new char[nama.length()];
        for (int j = 0; j < nama.length(); j++) {
            ch[j] = nama.charAt(j);
            if (((j > 0) && (ch[j] != ' ') && (ch[j - 1] == ' ')) || ((ch[0] != ' ') && (j == 0)))
                hitungKata++;
        }
        for (int i = 0; i < nama.length(); i++) {
            if (nama.charAt(i) != ' ')
                hitungHuruf++;
        }
        System.out.println("Jumbah Huruf adalah = " + hitungHuruf);
        System.out.println("Jumlah Kata adalah = " + hitungKata);
    }
}
