package main;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Double PI = Double.valueOf(String.format(Locale.ENGLISH, "%.10f", calculatePi(170)));
        Double piFromMath = Double.valueOf(String.format(Locale.ENGLISH, "%.10f", Math.PI));
        if (PI == piFromMath) {
            System.out.println("Equals!");
        } else {
            System.out.println(PI);
            System.out.println(piFromMath);
            System.out.println("No");
        }
    }

    public static double calculatePi(int iterationsCount) {
        double pi = 3;

        for (int i = 0, base = 2; i < iterationsCount; i++, base += 2) {
            pi += (i % 2 == 0 ? 1 : -1) * 4.0 / (base * (base + 1) * (base + 2));
        }

        return pi;
    }
}

