package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    void shouldCalculateForAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}