package com.example.lab03.services;

public class CalculatorTask1 {
    public double calculateChByCount(double x, int n){
        double res=1, term=1;
        for(int i=1; i<=n; i++){
            term*=(x * x) / (2 * i * (2 * i - 1));
            res+=term;
        }
        return res;
    }

    public double[] calculateChByDelta(double x, double e){
        double term = 1;
        double[] res = new double[]{1, 0};
        while (term > e) {
            res[1] += 1.0;
            term *= (x * x) / (2.0 * res[1] * (2.0 * res[1] - 1.0));
            res[0] += term;
        }
        return res;
    }

    private int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double calculateTrue(double x){ return Math.cosh(x);}
}
