package com.company;

public class Main {

    public static void main(String[] args) {
//        Week today = Week.MONDAY;
//
//        Week thisWeek = Week.SUNDAY;
//        Week nextWeek = Week.SUNDAY;
//        System.out.println(thisWeek == nextWeek); // true
//
//        Color color = Color.BLUE;
//
//        Color.BLUE.colorInfo();
//        ColorAttr.BLUE.colorInfo();
        System.out.println(ColorOverride.BLUE.calc(5,10));
    }
}
