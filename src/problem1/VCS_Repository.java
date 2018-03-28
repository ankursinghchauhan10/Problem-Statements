package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import util_package.LoggerClass;

public class VCS_Repository {

	/** The logger. */
    private Logger logger;
    
    /**
     * Output
     */
    String output;
    
    ArrayList<Integer> tempList;
    
    /**
     * Instantiates a new VCS_Repository
     */
	public VCS_Repository() {
		logger = LoggerClass.getLocalLogger(this);
	}
	
	/**
	 * @param noOfFiles = No of files
	 * @param noOfIgnoredFiles = No of ignored source file
	 * @param noOfTrackedFiles = No of tracked source file
	 * @param ignoredFilesList = "noOfIgnoredFiles" Size array with ignored files
	 * @param trackedFilesList = "noOfTrackedFiles" Size array with tracked files.
	 * @return count of files which are "Tracked and Ignored" and count of files 
	 * which are "Untracked and Unignored".
	 */
	public String getAllFileCount(int noOfFiles, int noOfIgnoredFiles, int noOfTrackedFiles, Integer ignoredFilesList[], Integer trackedFilesList[]) {
		output = null;
		
		logger.info("Total No. of Files :-" + noOfFiles + " , Ignored Files :-"
				+ noOfIgnoredFiles + " , Tracked Files :-" + noOfTrackedFiles);
		
		/**
		 * Validating the input
		 */
		if(noOfFiles >= noOfIgnoredFiles && noOfFiles >= noOfTrackedFiles){
			
			
			ArrayList<Integer> ignoredFileList = new ArrayList<>(Arrays.asList(ignoredFilesList));
			ArrayList<Integer> trackedFileList = new ArrayList<>(Arrays.asList(trackedFilesList));

			

			output = getTrackedAndIgnoredFileCount(ignoredFileList, trackedFileList)
					+ " , "
					+ getUntrackedAndUnignoredFileCount(ignoredFileList,
							trackedFileList, noOfFiles);
			logger.info("Result :- "+output);

		}else{
			logger.severe("No. of file count can never be less than the Tracked and Ignored files");
		}
				
		return output;
	}

	
	/**
	 * 
	 * @param ignoredFileList List of Ignored Files
	 * @param trackedFileList List of Tracked Files
	 * @return count of files which are tracked and ignored
	 */
	public int getTrackedAndIgnoredFileCount(ArrayList<Integer> ignoredFileList,ArrayList<Integer> trackedFileList) {
		logger.info("List of ignored files :- "+ignoredFileList+" , List of tracked files :- "+trackedFileList);
		
		/**
		 * tempList is to keep all the Tracked and Ignored files together
		 */
		tempList = new ArrayList<>();

		/**
		 * finding the common files in both tracked and ignored files list
		 */
		for (Integer fileName : ignoredFileList) {
			if (trackedFileList.contains(fileName)) {
				tempList.add(fileName);
			}
		}

		logger.info("Tracked And Ignored File Count :- "+tempList.size());
		
		return tempList.size();
	}

	
	/**
	 * 
	 * @param ignoredFileList List of Ignored Files
	 * @param trackedFileList List of Tracked Files
	 * @return count of files which are tracked and ignored
	 */
	/*public int getTrackedAndIgnoredFileCount_V1(ArrayList<Integer> ignoredFileList, ArrayList<Integer> trackedFileList) {
		logger.info("List of ignored files :- "+ignoredFileList+" , List of tracked files :- "+trackedFileList);
		
		*//**
		 * finding the common files in both tracked and ignored files list
		 *//*
		ignoredFileList.retainAll(trackedFileList);

		logger.info("Tracked And Ignored File Count :- "+ignoredFileList.size());
		
		return ignoredFileList.size();
	}*/

	/**
	 * 
	 * @param ignoredFileList List of Ignored Files
	 * @param trackedFileList List of Tracked Files
	 * @return count of files which are Untracked and Unignored
	 */
	public int getUntrackedAndUnignoredFileCount(ArrayList<Integer> ignoredFileList, ArrayList<Integer> trackedFileList, int noOfFiles) {
		logger.info("List of ignored files :- "+ignoredFileList+" , List of tracked files :- "+trackedFileList);
		
		/**
		 * tempList is to keep all files List
		 */
		tempList = new ArrayList<>();
		
		/**
		 * Creating list of all files
		 */
		for (int fileName = 1; fileName <= noOfFiles; fileName++) {
			tempList.add(fileName);
		}

		/**
		 * remove all common files from tempList
		 */
		
		tempList.removeAll(ignoredFileList);
		tempList.removeAll(trackedFileList);
		
		logger.info("Untracked And Unignored File Count :- "+tempList.size());
		return tempList.size();
	}
}