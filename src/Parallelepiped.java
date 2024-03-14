import java.util.Scanner;

import static java.lang.Math.pow;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введіть сторону А : ");
        double sideA = scaner.nextDouble();

        System.out.println("Введіть сторону B : ");
        double sideB = scaner.nextDouble();

        System.out.println("Введіть сторону С : ");
        double sideC = scaner.nextDouble();

        double degree = 2;

        while (sideA == sideB & sideC == sideB & sideC == sideA) {
            System.out.println("Данні не можуть бути схожими, введіть інші данні !");

            System.out.println("Введіть сторону А : ");
            sideA = scaner.nextDouble();

            System.out.println("Введіть сторону B : ");
            sideB = scaner.nextDouble();

            System.out.println("Введіть сторону С : ");
            sideC = scaner.nextDouble();
        }

        double volume = sideA * sideB * sideC;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        double lenght = pow(sideA, degree) + pow(sideB, degree) + pow(sideC, degree);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + lenght);

        scaner.close();
    }
}
