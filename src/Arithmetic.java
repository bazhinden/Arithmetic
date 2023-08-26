
public class Arithmetic {
    private int number1;
    private int number2;

    public Arithmetic(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    public int sum() {
        return number1 + number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public int maximum() {
        return Math.max(number1, number2);
    }

    public int minimum() {
        return Math.min(number1, number2);
    }
}


