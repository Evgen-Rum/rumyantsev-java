package com.company.utils;

import java.util.Scanner;

public class ScannerUtil {

    public static int readIntFromConsole(int defaultValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int num;
        for (int i = 0; true; i++) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                return num;
            } else if (i < 2) {
                System.out.println("Incorrect value! Please re-enter!");
                scanner.next();
            } else {
                return defaultValue;
            }
        }
    }

    public static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name!");
        return scanner.nextLine();
    }
}
