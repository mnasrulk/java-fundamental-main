package com.arnugroho.j4_latihan01;

import java.util.Scanner;

public class Lat2Method {
    static String vocalChange(String str) {
        String[] formatted = str.split("");
        for (int i = 0; i < formatted.length; i++) {
            if (formatted[i].matches("(?i)[AIUEOaiueo]")) {
                formatted[i] = String.valueOf(i);
            }
        }
        str = String.join("", formatted);
        System.out.println(str);

        return str;
    }

    static String reverseWord(String str) {
        String[] word = str.split(" ");
        String ans = "";
        for (int i = word.length - 1; i >= 0; i--) {
            ans += word[i] + " ";
        }
        System.out.println(ans);

        return str;
    }

    static String convertCapital(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 'a' + 'A');
                }
            } else if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 'a' - 'A');
        }
        String st = new String(ch);
        System.out.println(st);
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String str = scan.nextLine();
        scan.close();
        System.out.println("-----------------");
        vocalChange(str);
        System.out.println("\n");
        reverseWord(str);
        System.out.println("\n");
        convertCapital(str);
    }
}
