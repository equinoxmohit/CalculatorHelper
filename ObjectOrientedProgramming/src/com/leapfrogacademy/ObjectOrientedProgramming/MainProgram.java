/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogacademy.ObjectOrientedProgramming;

import com.leapfrogacademy.ObjectOrientedProgramming.util.CalculatorHelper;
import java.util.Scanner;
/**
 *
 * @author Mohit
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number x:");
        double x=sc.nextDouble();
        System.out.println("Enter number y:");
        double y=sc.nextDouble();
        CalculatorHelper calculatorHelper=new CalculatorHelper();
        System.out.println("The sum of two number is: " +calculatorHelper.addMethod(x, y));
        System.out.println("The difference of two number is: " +calculatorHelper.subtractMethod(x, y));
        System.out.println("The multiplication of two number gives: "+calculatorHelper.multiplyMethod(x, y));
        System.out.println("The division gives answer: "+calculatorHelper.divideMethod(x, y));
        System.out.println("The power has its answer: " +calculatorHelper.powerMethod(x, y));
        System.out.println("The maximum between the two number are: "+calculatorHelper.maxMethod(x, y));
        System.out.println("The minimum between the two number are: "+calculatorHelper.minMethod(x, y) );
    }
    
}
