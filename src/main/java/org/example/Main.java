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
    System.out.println();

    int i = 5;
    i = i++;
    System.out.println(i);
        //в данном случае просто была выполнена операция "++"
        // на чем все и закончилось (i = i) ++;
        // result = 5 (без ++) = 5
    i = 5;
    i = i++ + i++;
    System.out.println(i);
        //в данном случае выполняется операция добавления
        //между числами i++ и i
        //   result = (5++) + 5 (без ++) = 6 + 5 = 11
    i = 5;
    i = i++ + ++i;
    System.out.println(i);
        // result = (5++) + (++5) = 6 + 6 = 12
    i = 10;
    i = ++i + ++i;
    System.out.println(i);
        //result = (++5) + (++6) = 6 + 7 = 13


    }
}