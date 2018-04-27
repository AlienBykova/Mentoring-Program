package homeWorks.module4;

public class main {
    public static void main(String[] args) {
        NumbersOperations numbersOperations = new NumbersOperations();

        System.out.println(numbersOperations.sumOfHundredNumbers());
        System.out.println(numbersOperations.avgOfHundredNumbers());
        System.out.println(numbersOperations.evaluateSumOfRow(3));

        Double PI = Double.valueOf(String.format("%.10f", numbersOperations.calculatePi(170)));
        Double piFromMath = Double.valueOf(String.format("%.10f", Math.PI));
        if (PI == piFromMath) {
            System.out.println("Equals!");
        } else {
            System.out.println(PI);
            System.out.println(piFromMath);
            System.out.println("No");
        }
    }
}
