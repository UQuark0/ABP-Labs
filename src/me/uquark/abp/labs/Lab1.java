package me.uquark.abp.labs;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        while (true) {
            try {
                System.out.print("Катет A: ");
                a = scanner.nextDouble();
                System.out.print("Катет B: ");
                b = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат входных данных");
            }
        }
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("Периметр: %f\nПлощадь: %f\n", a + b + c, a * b / 2);
    }
}
