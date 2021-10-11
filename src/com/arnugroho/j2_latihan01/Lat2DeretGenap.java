/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j2_latihan01;

import java.util.Scanner;

/*
* Mencetak Deret Genap Sepanjang n
* Jika n = 6
* hasil : 2   4   6   8   10    12
*
* jika n = 3
* hasil : 2   4   6
* */
public class Lat2DeretGenap {
    public static void main(String[] args) {
        /* Gunakan Scanner agar nilai n dinamis */
        System.out.println("Masukkan Nomor: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i*2 + 2);
        }
    }
}
