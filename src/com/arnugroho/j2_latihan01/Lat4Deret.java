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
* hasil : 2   3   4   6   6   9
*
* jika n = 8
* hasil : 2   3   4   6   6   9   8   12
* */

public class Lat4Deret {

    static void pola(int n) {
        int a = 0;
        int b = 0;
        while (a < n) {
            a++;
            a = a + 1;
            b = b + 3;
            System.out.printf("%3d %3d", a, b);
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
