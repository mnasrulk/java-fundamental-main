package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat11ReverseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String str = scan.nextLine();
        scan.close();

        String[] word = str.split(" ");
        String ans = "";
        for (int i = word.length - 1; i >= 0; i--) {
            ans += word[i] + " ";
        }
        System.out.println(ans);
    }
}
