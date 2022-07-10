package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 90; i++) {
            if (i * i >= min && i * i <= max) {
                count++;
            }
        }
        return count;
    }

}

