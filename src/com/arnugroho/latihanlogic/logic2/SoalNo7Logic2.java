package com.arnugroho.latihanlogic.logic2;
import java.util.Arrays;
import java.util.Scanner;

public class SoalNo7Logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan bilangan n: ");
        int n=sc.nextInt();
        String[] pattern = new String [n];
        int index=0;
        //boolean toggle = true;
        Arrays.fill(pattern, "A");

        for(int i=0; i<n;i++){
            for (int j=0; j<index; j++){
                pattern[j]=" ";
                pattern[n-j-1] = " ";
            }
            pattern[n-i-1] = "" + (16-i*2);
            pattern[i]= "" + (i*2+1);
            if(i>(n-1)/2){
                index=3;
                //toggle = false;
                Arrays.fill(pattern, "B");
            }
            if (i>(n-1)/2){
                index--;
                Arrays.fill(pattern, "B");
            }
            else index++;

            for(String item: pattern)
                System.out.print(item);
            System.out.println();

        }

    }
}
