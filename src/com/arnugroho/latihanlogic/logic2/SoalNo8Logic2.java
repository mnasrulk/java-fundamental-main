package com.arnugroho.latihanlogic.logic2;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo8Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        String[] pattern = new String [n];
        Arrays.fill(pattern, " ");
        for (int i=0; i<=(n-1)/2; i++){
            for (int j=1; j<=i; j++){
                pattern[j-1] = "A";
                pattern[n-j] = "B";
            }
            pattern[n-i-1] = "" + (16-2*i);
            pattern[i] = "" + (2*i+1);
            for (String item:pattern){
                System.out.print(item);
            }
            System.out.println();
        }
        for (int i=0; i<(n-1)/2; i++){
            Arrays.fill(pattern, " ");
            for (int j=0; j<(n-1)/2-1-i; j++){
                pattern[j] = "A";
                pattern[n-1-j] = "B";
            }
            pattern [5+1] = "" + (11+2*i);
            pattern [3-i] = "" + (6-2*i);
            for (String item:pattern) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
