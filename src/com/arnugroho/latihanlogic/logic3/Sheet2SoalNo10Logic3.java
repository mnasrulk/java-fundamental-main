package com.arnugroho.latihanlogic.logic3;
import java.util.*;

public class Sheet2SoalNo10Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        String [] pattern = new String [n];
        for (int i=0; i<n ;i++){
            if (i==0 || i==n-1 || i==n-3 || i==2){
                Arrays.fill(pattern, "1");
                if (i==n-3 || i==2){
                    pattern[1] = "A";
                    pattern[n-2] = "A";
                }
            }
            else{
                if (i==4 || i==6 || i==5) {
                    Arrays.fill(pattern, "2");
                    pattern[3] = "B";
                    pattern[n-4] = "B";
                }
                else if (i==3||i==n-4)
                    Arrays.fill(pattern, "B");
                else
                    Arrays.fill(pattern, "A");
                pattern[0] = "1";
                pattern[n-1] = "1";
                pattern[1] = "A";
                pattern[n-2] = "A";
                if (i!=1 && i!=n-2){
                    pattern[2] = "1";
                    pattern[n-3] = "1";
                }
                if (i==(n-1)/2)
                    pattern[i] = "C";
            }
            for (String item: pattern){
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
