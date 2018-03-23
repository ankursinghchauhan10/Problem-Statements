package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution {

	
	/**
	 * 
	 * @param N = No of files
	 * @param M = No of ignored source file
	 * @param K = No of tracked source file
	 * @param A = M Size array with ignored files
	 * @param B = K Size array with tracked files.
	 * @return count of files which are "Tracked and Ignored" and count of files 
	 * which are "Untracked and Unignored".
	 */
	public String VCS(int N, int M, int K, Integer A[], Integer B[]) {

		ArrayList<Integer> ignoredFileList = new ArrayList<>(Arrays.asList(A));
		ArrayList<Integer> trackedFileList = new ArrayList<>(Arrays.asList(B));

		String output;

		output = getTrackedAndIgnoredFileCount(ignoredFileList, trackedFileList)
				+ " , "
				+ getUntrackedAndUnignoredFileCount(ignoredFileList,
						trackedFileList, N);
		
		return output;
	}

	
	/**
	 * 
	 * @param list1 List of Ignored Files
	 * @param list2 List of Tracked Files
	 * @return count of files which are tracked and ignored
	 */
	public int getTrackedAndIgnoredFileCount(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();

		for (Integer i : list1) {
			if (list2.contains(i)) {
				list.add(i);
			}
		}

		return list.size();
	}

	
	/**
	 * 
	 * @param list1 List of Ignored Files
	 * @param list2 List of Tracked Files
	 * @return count of files which are tracked and ignored
	 */
	public int getTrackedAndIgnoredFileCount_V1(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		list1.retainAll(list2);

		return list1.size();
	}

	/**
	 * 
	 * @param list1 List of Ignored Files
	 * @param list2 List of Tracked Files
	 * @return count of files which are Untracked and Unignored
	 */
	public static int getUntrackedAndUnignoredFileCount(ArrayList<Integer> list1, ArrayList<Integer> list2, int N) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		list.removeAll(list1);
		list.removeAll(list2);
		return list.size();
	}
}
