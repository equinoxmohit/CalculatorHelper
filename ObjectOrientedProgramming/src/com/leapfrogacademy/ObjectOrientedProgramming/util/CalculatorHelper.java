/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogacademy.ObjectOrientedProgramming.util;

/**
 *
 * @author Mohit
 */
public class CalculatorHelper {

    public double addMethod(double x, double y) {
        return x + y;
    }

    public double subtractMethod(double x, double y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    public double divideMethod(double x, double y) {
        if (x > y) {
            return x / y;
        } else {
            return y / x;
        }
    }

    public double multiplyMethod(double x, double y) {
        return x * y;
    }

    public double powerMethod(double x, double y) {
            double a=1;
            for(double i=1; i<=y; i=i+1.0)
            {
                a=a*x;
            }
            return a;
     
    } 
   
    public double maxMethod(double x, double y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    
    public double minMethod(double x, double y)
    {
        if(x<y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

}
