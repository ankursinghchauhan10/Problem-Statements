package problem3;


public class Solution {

	
	/**
	 * 
	 * @param l Left most number of given range
	 * @param r Right most number of given range
	 * @return sum of all the palindrome numbers
	 */
	public long sumOFPalindromeNumbers(int l, int r) {

		int temp = 0, n = 0, m = 0, sum = 0, total = 0;

		for (int i = l; i <= r; i++) {
			temp = i;
			sum = 0;
			while (temp > 0) {
				sum = (sum * 10) + (temp % 10);
				temp = temp / 10;
			}

			if (sum == i) {
				total += sum;
			}
		}

		return total;
	}

}
