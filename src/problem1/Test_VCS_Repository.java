package problem1;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test_VCS_Repository {
	
	static VCS_Repository ob;
	
	@BeforeClass
	public static void init(){
		ob = new VCS_Repository();
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

		String output = ob.getAllFileCount(N, M, K, A, B);
		
		//Output of the VCS Function
		System.out.println(output);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}

}