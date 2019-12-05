package com.kodilla.spring.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Calculator {
    @Autowired
    private Display display;
    private double val;
    public double add(double a, double b){
        val=a+b;
        display.displayValue( val);
        return val;
    }
    public double  sub(double a, double b) {
        val=a-b;
        display.displayValue( val);
        return val;
    }
    public double  mul(double a, double b) {
        val=a*b;
        display.displayValue( val);
        return val;
    }
    public double  div(double a, double b) {
        if(b!=0) {
            val=a/b;
        }
        else {
            val = 0;
        }
        display.displayValue( val);
        return val;
    }
}
