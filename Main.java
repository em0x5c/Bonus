package com.company;

public class Main {
    public static void main(String[] args) {
        int transfer = 5000;
        int totalbonus = 0;
        if (transfer >= 1000) {
            totalbonus = transfer / 100;
        }
        System.out.println("При пополнении счета на " + transfer + " руб., итоговый бонус равен "
                + totalbonus + " руб.");

    }
}
