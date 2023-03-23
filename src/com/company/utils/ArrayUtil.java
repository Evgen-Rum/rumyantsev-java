package com.company.utils;

import static com.company.utils.ScannerUtil.readIntFromConsole;

public class ArrayUtil {

    public static int[] getNumbersArrayFromConsole() {
        System.out.println("Please enter array length!");
        int size = readIntFromConsole(1);
        int[] array = new int[size];
        System.out.println("Insert array elements!");
        for (int i = 0; i < size; i++) {
            array[i] = readIntFromConsole(1);
        }
        return array;
    }
}
