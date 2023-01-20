package pl.javastart.task;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product1 = "Mleko";
        String producer1 = "Mlekowita";
        float price1 = 2.5F;

        String product2 = "Czekolada";
        String producer2 = "Wedel";
        float price2 = 2.19F;

        System.out.printf(Locale.ROOT, "%s %s %.2fzł\n", product1, producer1, price1);
        System.out.printf(Locale.ROOT, "%s %s %.2fzł", product2, producer2, price2);
    }
}
