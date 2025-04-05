package Chapter04FunctionsAndClass;

import java.util.Locale;
import java.util.Scanner;

//exerício sobre moedas e conversão de câmbio.

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Ex07CurrencyConverter currency = new Ex07CurrencyConverter();

        System.out.print("What is the dollar exchange rate (in BRL)? ");
        currency.quote = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        currency.amount = sc.nextDouble();

        System.out.println();
        System.out.println("Note: IOF is a 6% tax on currency conversion.");
        System.out.printf("IOF tax (%.0f%%) = %.2f%n", Ex07CurrencyConverter.IOF, currency.total_IOF());
        System.out.println();
        System.out.printf("Total with IOF: R$ %.2f%n", currency.total_with_IOF());
        System.out.printf("Base amount (no tax): R$ %.2f%n", currency.total_without_IOF());

        sc.close();
    }
}
