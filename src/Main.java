import tax.ProgressiveTaxType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    //В методе main создадим несколько счетов и оплатим с них налоги в налоговую службу.
    //private static double first = 1000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal(1000), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(10000), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(200000), new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }

    }
}



