package com.company;

public class Identification {
    public static String identification(String operandCheck) {
        String[] arabskye = {"-10", "-9", "-8", "-7", "-6", "-5", "-4", "-3", "-2", "-1", "0", "10","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rimskye = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String ident = "";
        for (int i = 0; i < arabskye.length; i++) {
            if (operandCheck.equals(arabskye[i])) {
                ident = "arab";
            } else {
                for (int x = 0; x < rimskye.length; x++) {
                    if (operandCheck.equals(rimskye[x])) {
                        ident = "rim";
                    }
                }
            }

        }
        return ident;
    }
}
