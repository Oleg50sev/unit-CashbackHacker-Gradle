package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnRemain500IfAmount500() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemain1IfAmount999() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemain0IfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemain999IfAmount1001() {

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemain1000IfAmount0() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemain999fAmount1() {

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

}