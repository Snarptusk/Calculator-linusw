package com.exercise.maven.Calculator_linusw;

import java.util.Scanner;

/**
 * This is a scientific calculator which can use ten different operations.
 *@author - Linus Wiksten, KVALIT18.
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        Calculator Calculator = new Calculator();
        
        Scanner reader = new Scanner(System.in);
        
        String input;
        
        System.out.println("Please specify if you would like to calculate a basic or advanced operation. (basic/advanced)");
        input = reader.nextLine();
        input = input.toLowerCase();
        
        if(input.equals("basic"))
        {
        	System.out.println("Select an operation to calculate (plus, minus, multiply, divide)");
            input = reader.nextLine();
            input = input.toLowerCase();
            
            System.out.println("Please input your first number: ");
            Calculator.setFirstNumber(reader.nextDouble());
            Calculator.getFirstNumber();
            
            System.out.println("Please input your second number: ");
            Calculator.setSecondNumber(reader.nextDouble());
            Calculator.getSecondNumber();
            
            if(input.equals("plus"))
            	System.out.println(Calculator.firstNumber + " + " + Calculator.secondNumber + " = " + Calculator.addition());
            
            if(input.equals("minus"))
            	System.out.println(Calculator.firstNumber + " - " + Calculator.secondNumber + " = " + Calculator.subtraction());
            
            if(input.equals("multiply"))
            	System.out.println(Calculator.firstNumber + " * " + Calculator.secondNumber + " = " + Calculator.multiplication());
            
            if(input.equals("divide"))
            	System.out.println(Calculator.firstNumber + " / " + Calculator.secondNumber + " = " + Calculator.division());
        }
        
        else if (input.equals("advanced"))
        {
        	System.out.println("Select an operation to calculate (random, square root, modulo, exponent, round, absolute value): ");
        	input = reader.nextLine();
            input = input.toLowerCase();
            
            System.out.println("Please input your first number: ");
            Calculator.setFirstNumber(reader.nextDouble());
            Calculator.getFirstNumber();
            
            System.out.println("Please input your second number: (if your operation only requires one number, enter any number)");
            Calculator.setSecondNumber(reader.nextDouble());
            Calculator.getSecondNumber();
            
            if(input.equals("random"))
            	System.out.println("Number " + Calculator.random() + " generated at random between numbers " + Calculator.firstNumber + " and " + Calculator.secondNumber);
            
            if(input.equals("square root"))
            	System.out.println("The square root of " + Calculator.firstNumber + " = " + Calculator.squareRoot());
            
            if(input.equals("modulo"))
            	System.out.println(Calculator.firstNumber + " % " + Calculator.secondNumber + " = " + Calculator.modulo());
            
            if(input.equals("exponent"))
            	System.out.println(Calculator.firstNumber + "^" + Calculator.secondNumber + " = " + Calculator.exponent());
            
            if(input.equals("round"))
            	System.out.println(Calculator.firstNumber + " rounded equals: " + Calculator.round());
            
            if(input.equals("absolute value"))
            	System.out.println("The absolute value of " + Calculator.firstNumber + " is " + Calculator.absoluteValue());
        }
        
        reader.close();
    }
}
