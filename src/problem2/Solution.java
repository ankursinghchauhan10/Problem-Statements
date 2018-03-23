package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution {

	ArrayList<Integer> soldiers_weapons_count;
	/**
	 * 
	 * @param N Number of soldiers
	 * @param A an array A1, A2, ..., AN, where Ai  denoted number of weapons ith soldier is having
	 * @return returns whether Army is ready for battle or not
	 */
	public String isArmyReadyForBattle(int N, Integer A[]) {
		soldiers_weapons_count = new ArrayList<>(Arrays.asList(A));
		int lucky_soldier_counter = 0;
		String output;

		for (Integer i : soldiers_weapons_count) {
			if (i % 2 == 0) {
				lucky_soldier_counter++;
			}
		}

		if (lucky_soldier_counter > N / 2) {
			output = "READY FOR BATTLE";
		} else {
			output = "NOT READY";
		}
		return output;
	}
}