package ru.netology.sqr;

public class SQRService {
    public int cqrCount (int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int tempBorder = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tempBorder;
        }

        if (leftBorder  > 9801 | rightBorder  < 100 ) {
            return 0;
        }

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= leftBorder & Math.pow(i, 2) <= rightBorder ) {
                counter++;
            }
        }
        return counter;
    }
}
