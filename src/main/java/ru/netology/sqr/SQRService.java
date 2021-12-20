package ru.netology.sqr;

public class SQRService {

    public int calculateBoarders(int top, int bottom) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i <= top && i * i >= bottom) {
                count++;
            }
            return count;
        }
        return 0;

    }
}
