package com.company;


//
public class LinearRecursion {
    //Thuat toan Euclid (tim uoc chung lon nhat)
    public int euclid(int a, int b) {
        if(b == 0) return a;//breaking condition
        return euclid(b, a%b);
    }

    //Thuat toan Factorial (tinh giai thua)
    public int factorial(int n) {
        if(n == 0) return 1;
        return n*factorial(n-1);
    }
}
