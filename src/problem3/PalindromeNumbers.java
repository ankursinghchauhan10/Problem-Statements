package problem3;

import java.util.logging.Logger;

import util_package.LoggerClass;


public class PalindromeNumbers {

	/** The logger. */
    private Logger logger;
	
    /**
     * Instantiates a new PalindromeNumbers
     */
	public PalindromeNumbers() {
		logger = LoggerClass.getLocalLogger(this);
	}
	
	/**
	 * 
	 * @param startingNumber Left most number of given range
	 * @param endingNumber Right most number of given range
	 * @return sum of all the palindrome numbers
	 */
	public long getSumOFPalindromeNumbers(int startingNumber, int endingNumber) {

		long total = 0;

		logger.info("Starting number " + startingNumber + " , Ending Number "
				+ endingNumber);

		if (startingNumber <= endingNumber) {
			for (int number = startingNumber; number <= endingNumber; number++) {
				if (isPalindrome(number)) {
					logger.info(number + " is Palindrome number");
					total += number;
				}

			}
		} else {
			logger.severe("Starting number can not be greater than ending number");
		}

		logger.info("Sum of Palindrome number is " + total);

		return total;
	}

	/**
	 * Check if given number is Palindrome or not
	 * @param number number to check if palindrome
	 * @return true if number is palindrome else false
	 */
	public boolean isPalindrome(int number) {
		int tempNumber = number;
		int sum = 0;

		while (tempNumber != 0) {
			sum = (sum * 10) + (tempNumber % 10);
			tempNumber /= 10;
		}

		if (sum == number)
			return true;
		else
			return false;

	}
}