package com.arnugroho.j2_latihan01;

import java.util.Scanner;

public class Lat9StarReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String str = scan.nextLine();
        scan.close();
        String[] outputArray = new String[str.length()];
        String[] inputSplit = str.split(" ");
        int index = 0;
        for (String child : inputSplit) {
            String[] childSplit = child.split("");
            for (int i = 0; i < childSplit.length; i++) {
                if (i == 0 || i == childSplit.length - 1)
                    outputArray[index++] = childSplit[i];
                else
                    outputArray[index++] = "*";
            }
            if (index + 2 <= outputArray.length)
                outputArray[index++] = " ";
        }
        String output = " ";
        for (String i : outputArray)
            output += i;
        System.out.println(output);
    }
}
