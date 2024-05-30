package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int x = 3;
    int y = 4;
    System.out.println("Сумма чисел "+(x + y));
    System.out.println("Сумма знаков "+ (x)+(y));
    System.out.println();

    String y1 = "101";
    String y2 = "11";
    String y3 = "111";
    System.out.println("Число "+y1+ " равно "+Integer.parseInt(y1,2)+ " в десятичной системе");
    System.out.println("Число "+y2+ " равно "+Integer.parseInt(y2,2)+ " в десятичной системе");
    System.out.println("Число "+y3+ " равно "+Integer.parseInt(y3,2)+ " в десятичной системе");
    System.out.println();

    int x1 = 2;
    int x2 = 23;
    int x3 = 15;
    System.out.println("число 2 в двоичной системе это: "+Integer.toBinaryString(x1));
    System.out.println("число 23 в двоичной системе это: "+Integer.toBinaryString(x2));
    System.out.println("число 15 в двоичной системе это: "+Integer.toBinaryString(x3));
    }
}