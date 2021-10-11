package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat9StarReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String str = scan.nextLine();
        scan.close();
        char ch = '*';
        int pos = 2;

        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(pos, ch);
        str = sb.toString();

        System.out.println(str);

    }
}
