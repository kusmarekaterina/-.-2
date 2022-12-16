public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int start = 0;
        int inMonth = 15000;
        int numberMonth = 0;
        while (start < 2459000) {
            start = start + inMonth;
            numberMonth = numberMonth + 1;
            System.out.println("Месяц " + numberMonth + " Сумма накоплений равна " + start + " рублей");
        }
    }

    public static void task2() {
        int i = 0;
        while (i<10) {
            i = i+1;
            System.out.print(" "+i);
        }
        System.out.println();
        for (; i>=1; i=i-1) {
            System.out.print(" "+i);
        }
    }

    public static void task3() {
        System.out.println();
        int totalPopulation = 12_000_000;
        int natalityPer1000 = 17;
        int deathRatePer1000 = 8;
        int numberOfBirths = totalPopulation / 1000 * natalityPer1000;
        int numberOfDeaths = totalPopulation / 1000 * deathRatePer1000 ;
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation - numberOfDeaths + numberOfBirths;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }

    }

    public static void task4() {
        int start = 15000;
        int month = 0;
        while (start < 12_000_000) {
            start = start + (start * 7 / 100);
            month = month + 1;
            System.out.println("Месяц " + month + " Сумма накоплений равна " + start + " рублей");
        }
        System.out.println("Нужно месяцев: " + month);
    }

    public static void task5() {
        int start = 15000;
        int month = 0;
        while (start < 12_000_000) {
            start = start + (start * 7 / 100);
            month = month + 1;
            boolean month1 = month % 6 == 0;
            if (!month1) {
                continue;
            }
            System.out.println("Месяц " + month + " Сумма накоплений равна " + start + " рублей");
        }
        System.out.println("Нужно месяцев: " + month);
    }

    public static void task6() {
        int start = 15000;
        int month = 0;
        while (month < 12*9) {
            start = start + (start * 7 / 100);
            month = month + 1;
            boolean month1 = month % 6 == 0;
            if (!month1) {
                continue;
            }
            System.out.println("Месяц " + month + " Сумма накоплений равна " + start + " рублей");
        }
    }

    public static void task7 () {
        int friday = 2;
        for (; friday < 31; friday=friday+7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        int year = 0;
        int thisYear = 2022;
        for (; year < thisYear+100; year = year +79) {
            if (year<thisYear-200)
                continue;
            System.out.println(year);
        }

    }

}
