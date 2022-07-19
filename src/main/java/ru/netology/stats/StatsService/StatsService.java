package ru.netology.stats.StatsService;

public class StatsService {

    public int SalesSum(long[] sales) {
        long sum = 0;
        for (long praice : sales) {
            sum = sum + praice;
        }
        return (int) sum;
    }

    public double Amount(long[] sales) {
        var sum = SalesSum(sales);
        return (double) sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int MaxMonth = 0;
        int Month = 0;
        for (long Sale : sales) {
            if (Sale >= sales[MaxMonth]) {
                MaxMonth = Month;
            }
            Month = Month + 1;
        }
        return MaxMonth + 1;
    }

    public int NumberMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int MountMAXAverageSales(long[] sales) {
        int mount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > Amount(sales))
                mount = mount + 1;
        }
        return mount;
    }


    public int MountMINAverageSales(long[] sales) {
        int mount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > Amount(sales))
                mount = mount + 1;
        }
        return mount;
    }
}









