package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String operand1 = sc.next();
        String vyr = sc.next();
        String operand2 = sc.next();
        int c = 0;
        String idennt1 = Identification.identification(operand1);
        String idennt2 = Identification.identification(operand2);
        if (idennt1.equals("arab") && idennt2.equals("arab")) {
            c = Calc.summ(operand1, operand2, vyr);
            System.out.println(c);
        } else if (idennt1.equals("rim") && idennt2.equals("rim")) {
            c = Calc.summ (Convector.convector(operand1), Convector.convector(operand2), vyr);
            String rez = String.valueOf(c);
            String rez2 = Convector.convector2(rez);
            System.out.println(rez2);
        } else {
            System.out.println("Некорректный ввод, повторите попытку.");
        }
        // System.out.println(rez);
    }

}
