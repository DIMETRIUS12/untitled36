package ru.netologyQA.stats;

public class StatsService {


    public int averageAmountSales(long[] sales) {

        long average = sumSales(sales);// средняя продажа в месяц.


        return (int) (average / 12); // Сумму продаж делим на количество месяцев в году и получаем среднюю сумму в месяц
    }


    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {

        long sum = 0; //сумма
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i]; // запомним его как сумму
        }
        return (int) sum; //сумма продаж
    }

    public int lessAverage(long[] sales) {
        int average = averageAmountSales(sales);
        int lessMonth = 0;            //
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { // значит, в рассматриваемом i-м месяце продаж меньше
                lessMonth++; // запомним его как минимальный
            }
        }

        return lessMonth; //ниже среднего
    }

    public int aboveAverage(long[] sales) {
        int average = averageAmountSales(sales);
        int aboveMonth = 0;            // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveMonth++; // больше среднего
            }
        }

        return aboveMonth; //
    }
}
