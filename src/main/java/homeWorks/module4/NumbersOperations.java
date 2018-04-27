package homeWorks.module4;

public class NumbersOperations {

    public int sumOfHundredNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float avgOfHundredNumbers() {
        return sumOfHundredNumbers() / 100;
    }

    public double evaluateSumOfRow(int number) {
        double sumOfRow = 0;
        for (int i = 1; i <=number; i++) {
            sumOfRow += (double) 1 / i;
        }
        return sumOfRow;
    }


    public static double calculatePi(int iterationsCount) {
        double pi = 3;

        for (int i = 0, base = 2; i < iterationsCount; i++, base += 2) {
            pi += (i % 2 == 0 ? 1 : -1) * 4.0 / (base * (base + 1) * (base + 2));
        }

        return pi;
    }
}
