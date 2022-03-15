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

        double a1;
        double a2;
        double b1;
        double b2;
        System.out.println("Enter the X1 Coordinate=");
        x1 = sc.nextDouble();
        System.out.println("Enter the Y1 Coordinate=");
        y1 = sc.nextDouble();
        System.out.println("Enter the X2 Coordinate=");
        x2 = sc.nextDouble();
        System.out.println("Enter the Y2 Coordinate=");
        y2 = sc.nextDouble();
        double lengthofline = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Coordinates=" + lengthofline);

        System.out.println("Enter the A1 Coordinate=");
        a1 = sc.nextDouble();
        System.out.println("Enter the B1 Coordinate=");
        b1 = sc.nextDouble();
        System.out.println("Enter the A2 Coordinate=");
        a2 = sc.nextDouble();
        System.out.println("Enter the B2 Coordinate=");
        b2 = sc.nextDouble();
        double lengthofline2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Coordinates=" +lengthofline2);

        equals( lengthofline, lengthofline2);
    }
    public static void equals(double lengthofline , double lengthofline2){
        if(lengthofline == lengthofline2){
            System.out.println("Both Lines Are Equal");
        } else {
            System.out.println("Lines Are Not Equal");
        }
    }
}