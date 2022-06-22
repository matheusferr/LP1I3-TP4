/*
 * @author Matheus Ferreira da Costa
 */
package com.company.util;

import java.util.Scanner;

public class InputValidator {

    private final Scanner scanner = new Scanner(System.in);

    private void printLabel(String label) {
        System.out.print(label);
    }

    public float validFloat(String label) {
        this.printLabel(label);

        float value = this.scanner.nextFloat();

        while (value < 0) {
            this.printLabel(label);

            value = this.scanner.nextFloat();
        }

        return value;
    }

    public int validInt(String label) {
        this.printLabel(label);

        int value = this.scanner.nextInt();

        while (value < 0) {
            this.printLabel(label);

            value = this.scanner.nextInt();
        }

        return value;
    }

    public float unvalidatedFloat(String label) {
        this.printLabel(label);

        return this.scanner.nextFloat();
    }

    public double unvalidatedDouble(String label) {
        this.printLabel(label);

        return this.scanner.nextDouble();
    }

    public String unvalidatedString(String label) {
        this.printLabel(label);

        return this.scanner.next();
    }

    public char unvalidatedChar(String label) {
        return this.unvalidatedString(label).toUpperCase().charAt(0);
    }
}
