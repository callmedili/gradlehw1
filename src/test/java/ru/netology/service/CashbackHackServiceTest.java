package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateForAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}