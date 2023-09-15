package ru.netology.stats;

public class StatsService {
    public int amountSales(long[] sales) {

        int amount = 0;
        for (long sale : sales) {
            amount = (int) (amount + sale);
        }
        return amount;
    }

    public double averageSales(long[] sales) {
        long averageSale = amountSales(sales) / sales.length;
        return (double) averageSale;
    }

    public int minSales(long[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        double monthBelowAverage = averageSales(sales);
        int countBelow = 0;

        for (long sale : sales) {
            if (sale < monthBelowAverage) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int countMonthsAboveAverage(long[] sales) {
        double monthAboveAverage = averageSales(sales);
        int countAbove = 0;

        for (long sale : sales) {
            if (sale > monthAboveAverage) {
                countAbove++;
            }
        }
        return countAbove;

    }
}

