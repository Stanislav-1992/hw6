public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            }

        // Задача 2
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задача 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача 7
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задача 8
        System.out.println("Задача 8");

        int savings = 29000;
        int months = 12;
        int total = 0;
        for (int i = 1; i <= months; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " руб");
        }
        System.out.println("Итого накопений за год " + total + " руб");


        // Задача 9
        System.out.println("Задача 9");

        int save = 29000;
        int month = 12;
        float depositPercent = 1.01F;
        float full = 0F;
        for (int i = 1; i <= month; i++) {
            full = full * depositPercent;
            full = full + save;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + full + " руб");
        }
        System.out.println("Итого накопений за год " + full + " руб");

        // Задача 10
        System.out.println("Задача 10");
        int number = 2;
        int step;
        for (int i = 1; i <= 10; i++) {
            step = number * i;
            System.out.println(number + " * " + i + " = " + step);
        }
    }
}