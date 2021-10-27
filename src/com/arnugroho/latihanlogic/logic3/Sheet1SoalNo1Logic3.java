package com.arnugroho.latihanlogic.logic3;
import java.util.Scanner;

public class Sheet1SoalNo1Logic3 {
    public static void main(String[] args) {
        int val1=0, val2=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            if (i==0)
                sum = 1;
            else
                sum = val1 + val2;
            System.out.print(sum + " ");
            val2=val2;
            val1=sum;
        }
    }
}
