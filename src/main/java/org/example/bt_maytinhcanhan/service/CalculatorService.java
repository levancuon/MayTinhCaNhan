package org.example.bt_maytinhcanhan.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{
    @Override
    public Double addition(double a, double b) {
        return a+b;
    }

    @Override
    public Double Subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public Double Multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public Double Division(double a, double b) {
        return a/b;
    }
}
