package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator listInt = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(scanner.nextDouble());
        doubleList.add(scanner.nextDouble());
        doubleList.add(scanner.nextDouble());
        System.out.println("listInt.calc(doubleList) = " + listInt.calc(doubleList));
        System.out.println("listInt.calc(doubleList) = " + listInt.calcUmn(doubleList));

        List<Integer> doubleList1 = new ArrayList<>();
        System.out.print("Введите три числа типа инт: ");
        doubleList1.add(scanner.nextInt());
        doubleList1.add(scanner.nextInt());
        doubleList1.add(scanner.nextInt());

        List<String> doubleList2 = new ArrayList<>();
        System.out.println("Введите три числа типа стринг: ");
        doubleList2.add(scanner.nextLine());
        doubleList2.add(scanner.nextLine());
        doubleList2.add(scanner.nextLine());


    }
}