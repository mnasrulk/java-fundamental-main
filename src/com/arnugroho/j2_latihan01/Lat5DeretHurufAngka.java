/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j2_latihan01;

import java.util.Scanner;

/*
* Mencetak Deret Berpola Sepanjang n
* Jika n = 6
* hasil : 2   A   4   B   6   C
*
* jika n = 8
* hasil : 2   A   4   B   6   C   8   D
* */
public class Lat5DeretHurufAngka {
    static String str(int i) {
        return i <= 0 ? "" : str((i / 26) - 1) + (char) (65 + i % 26);
    }

    static void pola(int n) {
        int j = 0;
        int i = 0;
        while (j <= n) {
            j++;
            j = j + 1;
            i++;
            System.out.printf("%3d %3s", j, str(i));
        }
    }

    public static void main(String[] args) {
        /* Gunakan Scanner agar nilai n dinamis */
        System.out.println("Masukkan Nomor: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        pola(n);
    }
}
