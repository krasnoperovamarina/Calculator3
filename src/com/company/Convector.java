package com.company;

public class Convector {
    public static String convector(String rimArab) {
        String[] rimskye = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabskye = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < rimskye.length; i++) {
            if (rimArab.equals(rimskye[i])) {
                rimArab = arabskye[i];
            }
        }
        return rimArab;
    }

    public static String convector2(String rez) {
        String[] arabskye2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
        String[] rimskye2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        int arabRim1 = Integer.parseInt(rez);
        int x1 = 0;
        int x2 = 0;
        String rimskItog = "";
        if (arabRim1 < 10 || arabRim1 == 100) {
            for (int x = 0; x < arabskye2.length; x++) {
                if (rez.equals(arabskye2[x])) {
                    rimskItog = rimskye2[x];
                }
            }
        } else {
            x1 = arabRim1 % 10;
            if (x1 == 0) {
                for (int f = 0; f < arabskye2.length; f++) {
                    if (rez.equals(arabskye2[f])) {
                        rimskItog = rimskye2[f];
                    }
                }
            } else if (x1 > 0) {
                x2 = (arabRim1 - x1);

                String arabOstasok = String.valueOf(x1);
                String arabDesyatok = String.valueOf(x2);
                for (int y = 0; y < arabskye2.length; y++) {
                    if (arabOstasok.equals(arabskye2[y])) {
                        arabOstasok = rimskye2[y];
                    }
                    for (int d = 0; d < arabskye2.length; d++) {
                        if (arabDesyatok.equals(arabskye2[d])) {
                            arabDesyatok = rimskye2[d];
                        }
                    }
                    rimskItog = arabDesyatok + arabOstasok;
                }
            }
        }
        return rimskItog;
    }
}


