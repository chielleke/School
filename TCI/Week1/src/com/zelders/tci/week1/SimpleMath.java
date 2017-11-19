package com.zelders.tci.week1;

public class SimpleMath {
    public double sum(int first, int second){
        double res = -1;
        res = first+second;
        return res;
    }
    public double divide(int first, int second){
        double res = -1;
        res = first/second;
        return res;
    }
    public double modulo(int first, int modulo){
        double res = -1;
        res = first%modulo;
        return res;
    }
    public double power(int first, int power){
        double res = -1;
        res = Math.pow(first,power);
        return res;
    }
}