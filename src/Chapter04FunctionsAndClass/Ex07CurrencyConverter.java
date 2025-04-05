package Chapter04FunctionsAndClass;

public class Ex07CurrencyConverter {

    public static final double IOF = 6.0;

    double quote;
    double amount;

    public double total_with_IOF() {
        return amount * quote * (1 + IOF / 100);
    }

    public double total_without_IOF() {
        return amount * quote;
    }

    public double total_IOF() {
        return total_without_IOF() * (IOF / 100);
    }
}

