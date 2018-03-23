package problem1;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestFile {
	
	static Solution ob;
	
	@BeforeClass
	public static void init(){
		ob = new Solution();
	}
	
	
	@Test()
	public void TestVCSSystem() {

		int N = 7, M = 4, K = 6;
		Integer A[] = { 1, 4, 6, 7 };
		Integer B[] = { 1, 2, 3, 4, 6, 7 };
		String expected = "4 , 1";
		
		/*int N = 5, M = 4, K = 6;
		Integer A[] = { 1, 2, 5 };
		Integer B[] = { 3, 4 };
		String expected = "0 , 0";*/

		String output = ob.VCS(N, M, K, A, B);
		
		//Output of the VCS Function
		System.out.println(output);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}

}