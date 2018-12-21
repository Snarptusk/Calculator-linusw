package com.exercise.maven.Calculator_linusw;

import java.util.Random;

/**
 * This is our calculator class.
 * @author Linus Wiksten, KVALIT18.
 *
 */

public class Calculator implements CalculatorBasicOperationsInterface, CalculatorAdvancedOperationsInterface{
	
	double firstNumber;
	double secondNumber;
	
	Random random = new Random();
	
	/**
	 * This is the method that sets the first number.
	 * @param input The first double which will be used in the calculation.
	 * @return Returns the first number as a double.
	 */
	
	public double setFirstNumber(double input)
	{
		firstNumber = input;
		return firstNumber;
	}
	
	/**
	 * This is the method that gets the first number.
	 * @return Returns the first number from the object.
	 */
	
	public double getFirstNumber()
	{
		return this.firstNumber;
	}
	
	/**
	 * This is the method that sets the second number.
	 * @param input The second double which will be used in the calculation.
	 * @return Returns the second number as a double.
	 */
	
	public double setSecondNumber(double input)
	{
		secondNumber = input;
		return secondNumber;
	}
	
	/**
	 * This is the method that gets the second number.
	 * @return Returns the second number from the object.
	 */
	
	public double getSecondNumber()
	{
		return this.secondNumber;
	}
	
	/**
	 * This is the addition method.
	 * @param firstNumber The methods first summand.
	 * @param secondNumber The methods second summand.
	 * @return Returns the sum of the added summands.
	 */
	
	public double addition()
	{
		double result = firstNumber + secondNumber;
		return result;
	}
	
	/**
	 * This is the subtraction method.
	 * @param firstNumber The methods minuend.
	 * @param secondNumber The methods subtrahend.
	 * @return Returns the difference of the minuend and subtrahend.
	 */
	
	public double subtraction()
	{
		double result = firstNumber - secondNumber;
		return result;
	}
	
	/**
	 * This is the multiplication method.
	 * @param firstNumber The methods first factor.
	 * @param secondNumber The methods second factor.
	 * @return Returns the product of the two factors.
	 */
	
	public double multiplication()
	{
		double result = firstNumber * secondNumber;
		return result;
	}
	
	/**
	 * This is the division method.
	 * @param firstNumber The methods dividend.
	 * @param secondNumber The methods divisor.
	 * @return Returns the quotient of the dividend and divisor.
	 */
	
	public double division()
	{
		double result = firstNumber / secondNumber;
		return result;
	}
	
	/**
	 * This is the method that sets the first number.
	 * @param input The first double which will be used in the calculation.
	 * @return Returns the first number as a double.
	 */
	
	
	
	/**
	 * This is the random method.
	 * @param firstNumber This is the start of the random range.
	 * @param secondNumber This is the end of the random range.
	 * @return Returns a random value in the range of firstNumber to secondNumber.
	 */
	
	public double random()
	{
		double result = random.nextDouble() * (firstNumber - secondNumber) + secondNumber;
		return result;
	}
	
	/**
	 * This is the square root method.
	 * @param firstNumber This is the methods radicand.
	 * @return Returns the square root of the methods radicand.
	 */
	
	public double squareRoot()
	{
		double result = Math.sqrt(firstNumber);
		return result;
	}
	
	/**
	 * This is the modulo method.
	 * @param firstNumber This is the methods dividend.
	 * @param secondNumber This is the methods divisor.
	 * @return Returns the remainder of a division calculation.
	 */
	
	public double modulo()
	{
		double result = firstNumber % secondNumber;
		return result;
	}
	
	/**
	 * This is the exponent method.
	 * @param firstNumber This is the methods base number.
	 * @param secondNumber This is the methods exponent.
	 * @return Returns the product of the base raised to the exponents power.
	 */
	
	public double exponent()
	{
		double result = Math.pow(firstNumber, secondNumber);
		return result;
	}
	
	/**
	 * This is the round method.
	 * @param firstNumber This is the number that will be rounded either up or down.
	 * @return Returns a rounded number.
	 */
	
	public double round()
	{
		double result = Math.round(firstNumber);
		return result;
	}
	
	/**
	 * This is the absolute value method.
	 * @param firstNumber This is the number that will show it's absolute value.
	 * @return Returns the absolute value of the parameter.
	 */
	
	public double absoluteValue()
	{
		double result = Math.abs(firstNumber);
		return result;
	}
}
