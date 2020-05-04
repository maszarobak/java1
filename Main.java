package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Kalkulator w = new Kalkulator();
        System.out.println(w.WynikDodawania(5, 6));
        System.out.println(w.WynikOdejmowania(7, 8));

        KalkulatorStatystyczny a = new KalkulatorStatystyczny();
        System.out.println(a.sinus());
        System.out.println(a.WynikDodawania(56,7));
        System.out.println(a.WynikOdejmowania(56,7));
    }

    static class Kalkulator {
        int x;
        int y;

        int WynikDodawania(int x, int y) {
            return x + y;
        }

        int WynikOdejmowania(int x, int y) {
            return x - y;
        }
    }


    static class KalkulatorStatystyczny extends Kalkulator {
        int x;
        int y;
        double z = 30;

        double sinus() {
            return Math.sin(z);
        }
    }
}