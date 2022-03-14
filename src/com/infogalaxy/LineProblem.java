package com.infogalaxy;

import java.util.Scanner;

public class LineProblem {

    public static void main(String args[]) {
        System.out.println("Welcome to Line Comparision Problem Developed by Yash");
        Scanner sc = new Scanner(System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        //int sqrt = 1/2;
        System.out.println("Enter the X1 Coordinate=");
        x1 = sc.nextDouble();
        System.out.println("Enter the Y1 Coordinate=");
        y1 = sc.nextDouble();
        System.out.println("Enter the X2 Coordinate=");
        x2 = sc.nextDouble();
        System.out.println("Enter the Y2 Coordinate=");
        y2 = sc.nextDouble();
        // double v = Math.sqrt(Math.exp(x2 - x1) * 2) + (Math.exp(y2 - y1) * 2);
        double lengthofline = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Coordinates=" + lengthofline);
    }
}
