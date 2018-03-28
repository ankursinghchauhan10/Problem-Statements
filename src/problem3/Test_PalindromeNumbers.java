package problem3;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import util_package.LoggerClass;

public class Test_PalindromeNumbers {
	
	static PalindromeNumbers palindromeNumbers ;
	static Logger logger ;
	
	@BeforeClass
	public static void init(){
		
		/** Instantiating a new PalindromeNumbers class*/
		palindromeNumbers = new PalindromeNumbers();
		
		logger = LoggerClass.getLocalLogger(Test_PalindromeNumbers.class.getName());
	}
	
	@AfterClass
	public static void tearDown(){
		palindromeNumbers = null;
		logger = null ;
	}
	
	/**
	 * To test all Positive Scenarios
	 */
	@Test
	public void TestSumOfPalindrome_Positive() {

		logger.info("Positive Scenarios");
		
		long output = palindromeNumbers.getSumOFPalindromeNumbers(123, 150);

		assertEquals("Comparing Expected and Output", 272, output);

		output = palindromeNumbers.getSumOFPalindromeNumbers(-10, 10);

		assertEquals("Comparing Expected and Output", 0, output);

		output = palindromeNumbers.getSumOFPalindromeNumbers(10, 20);

		assertEquals("Comparing Expected and Output", 11, output);
		
		output = palindromeNumbers.getSumOFPalindromeNumbers(-20, -10);

		assertEquals("Comparing Expected and Output", -11, output);
	}

	/**
	 * To test all Negative Scenarios
	 */
	@Test
	public void TestSumOfPalindrome_Negative_NegativeRangeInput() {

		logger.info("Negative Scenarios");
		
		long output = palindromeNumbers.getSumOFPalindromeNumbers(-10, -20);

		assertEquals("Comparing Expected and Output", -11, output);

	}
	
	/**
	 * To test all Negative Scenarios
	 */
	@Test
	public void TestSumOfPalindrome_Negative_PositiveRangeInput() {

		logger.info("Negative Scenarios");
		
		long output = palindromeNumbers.getSumOFPalindromeNumbers(100, 90);

		assertEquals("Comparing Expected and Output", 99, output);

	}
}