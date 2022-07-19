package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StarsServicetest {
    @Test
    public void testSalesSum() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};
        int expected = 576;
        int actual = service.SalesSum(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Amount() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};
        double expected = 48.0;
        double actual = service.Amount(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};

        int expected = 11;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NumberMinSales() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};

        int expected = 4;
        int actual = service.NumberMinSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MountMAXAverageSales() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};

        int expected = 4;
        int actual = service.MountMAXAverageSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MountMINAverageSales() {
        StatsService service = new StatsService();
        long[] arr = {11, 23, 20, 8, 31, 37, 46, 111, 86, 69, 111, 23};

        int expected = 4;
        int actual = service.MountMINAverageSales(arr);
        Assertions.assertEquals(expected, actual);

    }


}
