package com.example;

public class Calculator {
    public int add(int addend1, int addend2) {
        return addend1 + addend2;
    }

    public int subtract(int minuend, int subtrahend) {

        if (subtrahend > minuend) {
            throw new IllegalArgumentException();
        }

        return minuend - subtrahend;
    }

    public int multiply(int factor1, int factor2) {
        return factor1 * factor2;
    }

    public int divide(int dividend, int divisor) {
        if (divisor > dividend) {
            throw new IllegalArgumentException();
        }

        return dividend / divisor;
    }
}

