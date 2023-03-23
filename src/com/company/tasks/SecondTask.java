package com.company.tasks;

public class SecondTask {

    public static void checkTheStringForGreeting(String name) {
        if (name.equals("Вячеслав")) {
            System.out.printf("Привет, %s", name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
