package main.java.homeWorks.module_5.calculator;

import java.util.Stack;

public class BaseCalculations {

    private Stack<Float> memory = new Stack();

    public static float getSum(float a, float b) {
        return a+b;
    }

    public static float getResidual(float a, float b) {
        return a-b;
    }

    public static float getDivision(float a, float b) {
        return a/b;
    }

    public static float getMultiplication(float a, float b){
        return a*b;
    }

    public void addToMemory(float result) {
        if(memory.size() == 0) {
            memory.push(result);
        }
        else {
            memory.push(memory.pop()+result);
        }
    }

    public void removeFromMemory(float result) {
        if(memory.size() == 0) {
            memory.push(result);
        }
        else {
            memory.push(memory.pop()-result);
        }
    }

    public void clearMemory() {
        memory.clear();
    }

    public float getMemoryResult() {
        return memory.peek();
    }
}
