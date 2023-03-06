public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
       
    }

    public static void task1() {
        System.out.println("Задание 1");
        int contribution = 15000;
        int savings = 0;
        int i = 0;

        while (savings <= 2_459_000) {
            savings = savings + contribution;


            System.out.println("Месяц " + i++ + " сумма накоплений равна " + savings + " рублей.");

        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 1;

        while (i <= 10) {

            System.out.print(i);
            i = i + 1;

        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i);

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");

        int countryY = 12_000_000;
        int mortality = 8;
        int birthRate = 17;

        int year = 1;
        while (year <= 10) {

            countryY = countryY + Math.round((float) (birthRate - mortality) / 1000 * countryY); // чтобы всё было точно.

            System.out.printf("Год " + year + " , численность населения составляет " + "%d %n", countryY);

            year++;
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        double income = 15000;
        double total = 0;
        int i = 0;
        for (; total <= 12_000_000; i++) {
            total = total + total * 0.07;
            total = total + income;

            System.out.printf("Месяц " + i + " , сумма накоплений составляет " + " %.2f \n", total); // 2 числа после , и перенос на следующую строку.
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        double income = 15000;
        double total = 0;
        int i = 0;
        for (; total <= 12_000_000; i++) {
            total = total + total * 0.07;
            total = total + income;
            if (i % 6 == 0) {
                System.out.printf("Месяц " + i + " , сумма накоплений составляет " + " %.2f \n", total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        double income = 15000;
        double total = 0;

        for (int i = 0; i <= 9 * 12; i++) {
            total = total + total * 0.07;
            total = total + income;
            if (i % 6 == 0) {
                System.out.printf("Месяц " + i + " , сумма накоплений составляет " + " %.2f \n", total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int numberFirstFriday = 3;

        for (int i = numberFirstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-ое число. Необходимо подготовить отчет.");

        }
    }

    public static void task8() {
        System.out.println("Задание 8");

        int yearFor = 2023;
        int year200 = yearFor - 200;
        int year100 = yearFor + 100;

        for (int i = year200 + 79; i < year100; i = i + 79) {


            System.out.println(i);

        }
    }
}








