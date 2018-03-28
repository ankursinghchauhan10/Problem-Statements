package problem1;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import util_package.LoggerClass;

public class Test_VCS_Repository {
	
	static VCS_Repository vcs_repository;
	
	/** The logger. */
    static private Logger logger;
	
	@BeforeClass
	public static void init(){
		
		/** Instantiating a new VCS_repository class*/
		vcs_repository = new VCS_Repository();
		
		logger = LoggerClass.getLocalLogger(Test_VCS_Repository.class.getName());
	}
	
	@AfterClass
	public static void tearDown(){
		vcs_repository = null;
		logger = null ;
	}
	
	/**
	 * To test Positive Scenario with correct input
	 */
	@Test()
	public void TestVCSSystem_Positive() {

		logger.info("Positive Scenarios");
		
		int noOfFiles = 7, noOfIgnoredFiles = 4, noOfTrackedFiles = 6;
		Integer ignoredFilesList[] = { 1, 4, 6, 7 };
		Integer trackedFilesList[] = { 1, 2, 3, 4, 6, 7 };
		String expected = "4 , 1";
		

		String output = vcs_repository.getAllFileCount(noOfFiles, noOfIgnoredFiles, noOfTrackedFiles, ignoredFilesList, trackedFilesList);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}
	
	
	/**
	 * To test Negative Scenario of wrong inputs
	 */
	@Test()
	public void TestVCSSystem_Negative() {
		
		logger.info("Negative Scenarios");
		
		/**
		 * If Ignored or Tracked file count is Entered more than Total number of files
		 */
		int noOfFiles = 4, noOfIgnoredFiles = 5, noOfTrackedFiles = 2;
		Integer ignoredFilesList[] = { 1, 2, 3, 4, 5};
		Integer trackedFilesList[] = { 1, 2};
		String expected = "2 , 0";
		
		
		String output = vcs_repository.getAllFileCount(noOfFiles, noOfIgnoredFiles, noOfTrackedFiles, ignoredFilesList, trackedFilesList);
		
		assertEquals("Comparing Expected and Output",expected, output);
	}

}