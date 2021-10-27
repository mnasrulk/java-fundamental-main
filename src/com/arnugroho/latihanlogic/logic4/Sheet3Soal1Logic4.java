package com.arnugroho.latihanlogic.logic4;
import java.util.*;

public class Sheet3Soal1Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan nilai n: ");
        int n = sc.nextInt();
        int val1=0, val2=1, sum=0;
        String[] pattern = new String[n], pattern2 = new String [n-1];
        int[] fibo = new int[n];
        char[] letter = new char[n];
        for (int i=0; i<n; i++){
            if (i==0)
                sum=1;
            else
                sum = val1+val2;
            fibo[i] = sum;
            val2 = val1;
            val1 = sum;
            letter[i]=(char)(65+i);
        }

        for (int i=0; i<n; i++){
            Arrays.fill(pattern, " ");
            pattern[i] = "" + fibo[i];
            pattern[n-i-1] = "" +fibo[n-i-1];

            for (int j=0; j<=(n-1)/4-i;j++){
                pattern[j+2+i] = "" + letter[j];
                if (j!=(n-1)/4-i)
                    pattern[n-3-j-i] = "" + letter[j];
            }
            for (int j=0; j<=i-6;j++){
                pattern[n-i+1+j] = "" + letter[j];
                if (j!=i-3*(n-1)/4)
                    pattern[i-2-j] = "" + letter[j];
            }

            if (i<=(n-1)/2) {
                for (int j=0; j<=i-2; j++)
                    pattern[j] = "" + letter[i-2-j];
                } else {
                    for (int j=0; j<=6-i; j++){
                        pattern[j] = "" + letter[6-i-j];
                    }
                }
                for (int h=0; h<n; h++){
                    if (h!=0)
                        pattern2[h-1] = pattern[n-h-1];
                    System.out.print(pattern[h]);
                }

                for (int h=0; h<n-1; h++){
                    System.out.print(pattern2[h]);
                }
                System.out.println();
            }
        }
    }

