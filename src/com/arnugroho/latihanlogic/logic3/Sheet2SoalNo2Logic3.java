package com.arnugroho.latihanlogic.logic3;
import java.util.Scanner;

public class Sheet2SoalNo2Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan nilai n: ");
        int n = sc.nextInt();
        int val1=0, val2=0, val3=0, sum=0;
        for (int i=0;i<n;i++){
            if (i<=2)
                sum = 1;
            else
                sum = val1+val2+val3;
            System.out.print(sum + " ");
            val3 = val2;
            val2 = val1;
            val1 = sum;
        }
    }
}
