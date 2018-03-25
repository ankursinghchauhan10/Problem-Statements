package problem3;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test_PalindromeNumbers {
	
	static PalindromeNumbers ob ;
	
	@BeforeClass
	public static void init(){
		ob = new PalindromeNumbers();
	}
	
	
	@Test
	public void TestSumOfPalindrome() {

		int L = 123, R = 150;
		long expected = 272;

		long output = ob.getSumOFPalindromeNumbers(L, R);

		//Output of the sumOFPalindromeNumbers Function
		System.out.println(output);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}

}
