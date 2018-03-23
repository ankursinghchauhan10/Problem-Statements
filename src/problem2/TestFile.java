package problem2;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestFile {
	
	static Solution ob;
	
	@BeforeClass
	public static void init(){
		ob = new Solution();
	}
	
	
	@Test
	public void Test_isArmyReadyForBattle() {

		/*int N = 4;
		Integer A[] = { 11, 12, 13, 14 };
		String expected = "NOT READY";*/
		
		int N = 5;
		Integer A[] = { 2,3,4,5,5 };
		String expected = "NOT READY";
		//String expected = "READY FOR BATTLE";

		String output = ob.isArmyReadyForBattle(N, A);

		//Output of the isArmyReadyForBattle Function
		System.out.println(output);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}

}
