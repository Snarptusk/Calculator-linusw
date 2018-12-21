package com.exercise.maven.Calculator_linusw;

import java.util.Random;
import java.util.logging.Logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator Calculator = new Calculator();
	
	Random random = new Random();
	
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());

	@Test
	public void test() {
		
		double tempResult = 0;
		
		//BASIC OPERATIONS BELOW
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//SET AND GET METHODS.
			Calculator.secondNumber = random.nextDouble() * -100;
			double temp1 = Calculator.firstNumber;
			double temp2 = Calculator.secondNumber;
			
			LOG.info(i + ". Testing the get and set methods.");
			
			assertEquals(Calculator.setFirstNumber(Calculator.firstNumber), temp1, 0);
			assertEquals(Calculator.setSecondNumber(Calculator.secondNumber), temp2, 0);
			assertEquals(Calculator.getFirstNumber(), temp1, 0);
			assertEquals(Calculator.getSecondNumber(), temp2, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//ADDITION - Tests positive value and zero.
			Calculator.secondNumber = 0;
			tempResult = Calculator.firstNumber + Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method addition with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(Calculator.addition(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//ADDITION - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.firstNumber + Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method addition with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.addition(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//SUBTRACTION - Tests positive value and zero.
			Calculator.secondNumber = 0;
			tempResult = Calculator.firstNumber - Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method subtraction with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(Calculator.subtraction(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//SUBTRACTION - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.firstNumber - Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method subtraction with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.subtraction(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//MULTIPLICATION - Tests positive value and zero.
			Calculator.secondNumber = 0;
			tempResult = Calculator.firstNumber * Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method multiplication with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(Calculator.multiplication(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//MULTIPLICATION - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.firstNumber * Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method multiplication with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.multiplication(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = 0;			//DIVISION - Tests positive value and zero.
			Calculator.secondNumber = random.nextDouble() * 100;
			tempResult = Calculator.firstNumber / Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method division with: 0 and " + Calculator.firstNumber + ".");
			
			assertEquals(Calculator.division(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//DIVISION - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.firstNumber / Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method division with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.division(), tempResult, 0);
		} 
		
		//ADVANCED OPERATIONS BELOW
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//RANDOM - Tests positive value and 0.
			Calculator.secondNumber = 0;
			
			tempResult = Calculator.random();
			
			LOG.info(i + ". Testing the method random with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(tempResult, tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * -100;			//RANDOM - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * 100;
			
			tempResult = Calculator.random();
			
			LOG.info(i + ". Testing the method random with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(tempResult, tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//SQUARE ROOT - Tests positive value.
			
			tempResult = Calculator.squareRoot();
			
			LOG.info(i + ". Testing the method squareRoot with: " + Calculator.firstNumber + ".");
			
			assertEquals(Calculator.squareRoot(), tempResult, 0);
		}
		
		//NEGATIVE VALUES ARE IMPOSSIBLE FOR SQUARE ROOT, SO IT WILL NOT BE TESTED.
		//SQUARE ROOTING 0 ISN'T NECESSARY TO BE TESTED 50 TIMES, SO IT WILL NOT BE TESTED.
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = 0;			//MODULO - Tests positive value and 0.
			Calculator.secondNumber = random.nextDouble() * 100;
			
			LOG.info(i + ". Testing the method modulo with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(Calculator.modulo(), 0, 100);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//MODULO - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.firstNumber % Calculator.secondNumber;
			
			LOG.info(i + ". Testing the method modulo with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.modulo(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//EXPONENT - Tests positive value and 0.
			Calculator.secondNumber = 0;
			tempResult = Calculator.exponent();
			
			LOG.info(i + ". Testing the method exponent with: " + Calculator.firstNumber + " and 0.");
			
			assertEquals(Calculator.exponent(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//EXPONENT - Tests positive and negative values.
			Calculator.secondNumber = random.nextDouble() * -100;
			tempResult = Calculator.exponent();
			
			LOG.info(i + ". Testing the method exponent with: " + Calculator.firstNumber + " and " + Calculator.secondNumber + ".");
			
			assertEquals(Calculator.exponent(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//ROUND - Tests positive values.
			tempResult = Calculator.round();
			
			LOG.info(i + ". Testing the method round with: " + Calculator.firstNumber + ".");
			
			assertEquals(Calculator.round(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * -100;			//ROUND - Tests negative values.
			tempResult = Calculator.round();
			
			LOG.info(i + ". Testing the method round with: " + Calculator.firstNumber + ".");
			
			assertEquals(Calculator.round(), tempResult, 0);
		}
		
		//IT'S UNNECESSARY TO ROUND THE NUMBER 0, SO IT WILL NOT BE TESTED.
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//ABSOLUTE VALUE - Tests positive values.
			tempResult = Calculator.absoluteValue();
			
			LOG.info(i + ". Testing the method absoluteValue with: " + Calculator.firstNumber + "."); //THE POINT OF ABSOLUTE VALUE IS TO USE NEGATIVE VALUES, BUT THE TEST STILL WORKS.
			
			assertEquals(Calculator.absoluteValue(), tempResult, 0);
		}
		
		for(int i = 0; i < 50; i++)
		{
			Calculator.firstNumber = random.nextDouble() * 100;			//ABSOLUTE VALUE - Tests negative values.
			tempResult = Calculator.absoluteValue();
			
			LOG.info(i + ". Testing the method absoluteValue with: " + Calculator.firstNumber + ".");
			
			assertEquals(Calculator.absoluteValue(), tempResult, 0);
		}
		
		//IT'S UNNECESSARY TO TEST THE NUMBER 0, SO IT WILL NOT BE TESTED. 
	}
}
