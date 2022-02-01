package com.company;


import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        System.out.println("___________________________________________________________");
        System.out.println("Enter the marks for percentage calculation...");
        System.out.println("___________________________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for first subject: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks for second subject: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks for third subject: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the marks for fourth subject: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the marks for fifth subject: ");
        float sub5 = sc.nextFloat();

        float per = ((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
        System.out.println("___________________________________________________________");
        System.out.println("                   Percentage is:"+per);
        System.out.println("___________________________________________________________");
    }
}
