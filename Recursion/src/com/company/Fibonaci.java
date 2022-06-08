package com.company;

public class Fibonaci {
    long fibonaci(int n) {
        if(n < 3) {
            return 1;
        }
        return fibonaci(n-1)+ fibonaci(n-2);
    }
    boolean isEven(int n) {
        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else {
            return isOdd(n - 1);
        }
    }

    boolean isOdd(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return isEven(n - 1);
        }
    }
}
