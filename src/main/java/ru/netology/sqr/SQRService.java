package ru.netology.sqr;

public class SQRService {
    public static int calculateBoarders(int top, int bottom) {
        int beginningCounter = 0;
        int endingCounter = 0;
        for (int i = 10; i < 100; ++i) {
            if (i * i >= bottom && i * i <= top) {
                endingCounter = beginningCounter + 1;
            }
            return endingCounter;
        }
            return 0;

    }
}
