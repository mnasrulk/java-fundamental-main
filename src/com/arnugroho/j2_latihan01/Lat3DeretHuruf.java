/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j2_latihan01;

import java.util.Scanner;

/*
* Mencetak Deret Huruf Sepanjang n
* Jika n = 6
* hasil : A  B   C   D   E   F
*
* jika n = 3
* hasil : A   B   C
* */
public class Lat3DeretHuruf {
    static String str(int i) {
        return i < 0 ? "" : str((i / 26) - 1) + (char) (65 + i % 26);
    }

    public static void main(String[] args) {
        /* Gunakan Scanner agar nilai n dinamis */
        System.out.println("Masukkan Nomor: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.printf("%3s", str(i));
        }

    }
}
