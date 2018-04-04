package main.java.homeWorks.module_5.calculator;

public class Calculations {
    public static void main(String[] args) {

        BaseCalculations calculator = new Calculator();
        Float sum = BaseCalculations.getSum(10, 20);
        Float div = BaseCalculations.getDivision(20, 10);
        Float multiple = BaseCalculations.getMultiplication(40, 50);
        Float res = BaseCalculations.getResidual(70, 80);

        calculator.addToMemory(sum);
        System.out.println(calculator.getMemoryResult());
        calculator.addToMemory(div);
        System.out.println(calculator.getMemoryResult());
        calculator.removeFromMemory(multiple);
        System.out.println(calculator.getMemoryResult());
        calculator.clearMemory();

        calculator.removeFromMemory(res);
        System.out.println(calculator.getMemoryResult());
        calculator.removeFromMemory(div);
        System.out.println(calculator.getMemoryResult());
        calculator.addToMemory(multiple);
        System.out.println(calculator.getMemoryResult());
        calculator.clearMemory();

    }
}
