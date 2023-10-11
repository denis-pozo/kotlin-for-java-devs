package org.denispozo.javacode;

public class DummyClass {

    public String isVacationTyme(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
