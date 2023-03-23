package com.company;

import com.company.tasks.FirstTask;
import com.company.tasks.SecondTask;
import com.company.tasks.ThirdTask;
import com.company.utils.ArrayUtil;
import com.company.utils.ScannerUtil;


public class Main {

    public static void main(String[] args) {
	    FirstTask.checkTheNumberForGreeting(ScannerUtil.readIntFromConsole(1));
        SecondTask.checkTheStringForGreeting(ScannerUtil.readStringFromConsole());
        ThirdTask.getNumberFromArray(ArrayUtil.getNumbersArrayFromConsole());
    }
}
