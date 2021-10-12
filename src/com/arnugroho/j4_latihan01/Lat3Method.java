package com.arnugroho.j4_latihan01;

import java.util.Scanner;
import java.util.regex.*;

public class Lat3Method {
    static String hitungVokal(Scanner scan) {
        String input = "";
        String state = "on";
        String modeState = "on";
        while (modeState.equals("on")) {
            input = "";
            System.out.println("Terima kasih telah memilih mode 3");
            System.out.println("Masukkan kalimat yang ingin anda hitung: ");
            while (input.equals(""))
                input = scan.nextLine();

            Pattern huruf = Pattern.compile("[AIUEOaiueo]");
            Matcher matcher = huruf.matcher(input);
            int vowelsCount = 0;
            while (matcher.find())
                ++vowelsCount;
            System.out.println("Jumlah huruf vokal: " + vowelsCount);

            String[] stopCount = stopAplikasi(scan);
            state = stopCount[0];
            modeState = stopCount[1];
        }
        return state;
    }

    static String hitungKalimat(Scanner scan) {
        String input = "";
        String state = "on";
        String modeState = "on";

        while (modeState.equals("on")) {
            input = "";

            System.out.println("Terima kasih telah memilih mode 2");
            System.out.println("Masukkan kalimat yang ingin anda hitung: ");
            while (input.equals(""))
                input = scan.nextLine();
            System.out.println("Jumlah kalimat : " + input.split("").length);

            String[] stopCount = stopAplikasi(scan);
            state = stopCount[0];
            modeState = stopCount[1];
        }
        return state;
    }

    static String hitungHuruf(Scanner scan) {
        String input = "";
        String state = "on";
        String modeState = "on";

        while (modeState.equals("on")) {
            input = "";

            System.out.println("Terima kasih telah memilih mode 1");
            System.out.println("Masukkan Kata yang ingin anda hitung: ");
            while (input.equals(""))
                input = scan.nextLine();
            String[] inputSplit = input.split(" ");
            int letterCount = 0;
            for (String subInput : inputSplit)
                letterCount += subInput.length();
            System.out.println("Jumlah huruf: " + letterCount);

            String[] stopCount = stopAplikasi(scan);
            state = stopCount[0];
            modeState = stopCount[1];
        }
        return state;
    }

    static String deretGanjil(Scanner scan) {
        String state = "on";
        String modeState = "on";
        while (modeState.equals("on")) {
            System.out.println("Masukkan Nilai: ");
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", i * 2 + 1);
            }
            System.out.println("\n");
            String[] stopCount = stopAplikasi(scan);
            state = stopCount[0];
            modeState = stopCount[1];
        }
        return state;
    }

    static String deretGenap(Scanner scan) {
        String state = "on";
        String modeState = "on";
        while (modeState.equals("on")) {
            System.out.println("Masukkan Nilai: ");
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", i * 2 + 2);
            }
            System.out.println("\n");
            String[] stopCount = stopAplikasi(scan);
            state = stopCount[0];
            modeState = stopCount[1];
        }
        return state;
    }

    static String[] stopAplikasi(Scanner scan) {
        String state = "on";
        String modeState = "on";

        String[] stop = new String[2];
        boolean stopLoop = true;
        while (stopLoop) {
            String stopArg = "";
            String stopArg2 = "";
            System.out.println("\n Apakah anda ingin mengakhiri program ini? (Y/N)");

            while (stopArg.equals(""))
                stopArg = scan.nextLine();
            if (stopArg.equals("Y")) {
                state = "off";
                modeState = "off";
                stopLoop = false;
            } else if (stopArg.equals("N")) {
                while (true) {
                    stopArg2 = "";
                    System.out.println("Apakah anda ingin kembali menjalankan aplikasi? (Y/N) \n");
                    while (stopArg2.equals(""))
                        stopArg2 = scan.nextLine();
                    if (stopArg2.equals("Y")) {
                        modeState = "off";
                        stopLoop = false;
                        break;
                    } else if (stopArg2.equals("hitung")) {
                        stopLoop = false;
                        break;
                    } else {
                        System.out.println("Masukkan anda salah. Ulangi(Y/N) \n");
                    }
                }
            } else {
                System.out.println("Masukkan anda salah. Ulangi(Y/N) \n");
            }
        }
        stop[0] = state;
        stop[1] = modeState;
        return stop;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String state = "on";

        while (state.equals("on")) {
            String input = "0";

            System.out.println("Masukkan Input mode: ");
            System.out.printf(
                    "1. Penjumlahan huruf\n2. Penjumlahan kata\n3. Penjumlahan huruf vokal\n4. deret ganjil\n5. deret genap\n");
            while (Integer.parseInt(input) == 0) {
                input = scan.nextLine();
                if (Integer.parseInt(input) > 6 || Integer.parseInt(input) < 0) {
                    System.out.println("Pilihan anda hanya 1 sampai 3");
                    System.out.println("Masukkan Input mode");
                    input = "0";
                }
            }
            switch (input) {
                case "1":
                    state = Lat3Method.hitungHuruf(scan);
                    break;
                case "2":
                    state = Lat3Method.hitungKalimat(scan);
                    break;
                case "3":
                    state = Lat3Method.hitungVokal(scan);
                    break;
                case "4":
                    state = Lat3Method.deretGanjil(scan);
                    break;
                case "5":
                    state = Lat3Method.deretGenap(scan);
                    break;
            }
        }
    }
}