package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat10ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String str = scan.nextLine();
        scan.close();

        char[] reverse = str.toCharArray();
        int left, right = 0;
        right = reverse.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = reverse[left];
            reverse[left] = reverse[right];
            reverse[right] = temp;
        }
        for (char c : reverse)
            System.out.print(c);
        System.out.println();
    }
}
