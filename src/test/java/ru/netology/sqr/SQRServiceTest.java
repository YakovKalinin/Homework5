package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @Test
    void shouldCalculateLow() {
        SQRService sqrService =new SQRService();
        int top = 121;
        int bottom = 100;
        int expected = 2;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateHi() {
        SQRService sqrService =new SQRService();
        int top = 10000;
        int bottom = 9800;
        int expected = 1;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateZero() {
        SQRService sqrService =new SQRService();
        int top = 0;
        int bottom = 0;
        int expected = 0;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculate99() {
        SQRService sqrService =new SQRService();
        int top = 9801;
        int bottom = 9801;
        int expected = 1;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculate100() {
        SQRService sqrService =new SQRService();
        int top = 10000;
        int bottom = 10000;
        int expected = 0;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculate9() {
        SQRService sqrService =new SQRService();
        int top = 81;
        int bottom = 81;
        int expected = 0;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNormal() {
        SQRService sqrService =new SQRService();
        int top = 300;
        int bottom = 200;
        int expected = 3;

        int actual = sqrService.calculateBoarders(top, bottom);

        assertEquals(expected, actual);
    }
}