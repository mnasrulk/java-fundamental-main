package com.arnugroho.latihanlogic.logic2;

import java.util.Scanner;
import java.util.Arrays;

public class SoalNo4Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        int[] pattern = new int [n];
        for (int i=0; i<n; i++){
            Arrays.fill(pattern, -100);
            pattern [n-i-1] = 16-2*i;
            pattern [(n-1)/2] = i*2+1;
            pattern [i] = i*2+1;
            if(i==(n-2)/2){
                for (int l=0; l<n; l++){
                    if(l!=(n-2)/2)
                        System.out.print(l*2);
                }
            }
            else{
                for(int item:pattern){
                    if(item!=-100)
                        System.out.print(item);
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
