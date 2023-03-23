package com.company.tasks;

public class ThirdTask {

    public static void getNumberFromArray(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
