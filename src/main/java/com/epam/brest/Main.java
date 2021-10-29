package com.epam.brest;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //result = m * pricePerKg + km * pricePerKm;
        //
        //

        BigDecimal weight, pricePerKg, length, pricePerKm;
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (!scanner.hasNext("q")) {

                weight = getValueCon(scanner, "Enter weight:");

                pricePerKg = getValueCon(scanner, "Enter pricePerKg");

                length = getValueCon(scanner, "Enter leght:");

                pricePerKm = getValueCon(scanner, "Enter pricePerKm");

                BigDecimal result = weight.multiply(pricePerKg).add(length.multiply(pricePerKm));
                System.out.println("Result:" + result);
            }
        }

    }

    private static BigDecimal getValueCon(Scanner scanner, String s) {
        BigDecimal enteredValue;
        System.out.print("Enter m:");
        enteredValue = scanner.nextBigDecimal();
        System.out.println("Enter value:" + enteredValue);
        return enteredValue;
    }

}
