/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j2_latihan01;

import java.util.Scanner;

/*
* Mencetak Deret Ganjil Sepanjang n
* Jika n = 6
* hasil : 1   3   5   7   9    11
*
* jika n = 3
* hasil : 1   3   5
* */
public class Lat1DeretGanjil {
    public static void main(String[] args) {
        /* Gunakan Scanner agar nilai n dinamis */
        System.out.println("Masukkan nomor:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i * 2 + 1);
        }
    }
}
