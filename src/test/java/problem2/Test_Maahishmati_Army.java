package problem2;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import problem1.Test_VCS_Repository;
import problem1.VCS_Repository;
import util_package.LoggerClass;

public class Test_Maahishmati_Army {
	
	static Maahishmati_Army maahishmati_Army;
	
	/** The logger. */
    static private Logger logger;
	
    String output;
	
    /**
     * Initialises class objects
     */
	@BeforeClass
	public static void init(){
		
		/** Instantiating a new Maahishmati_Army class*/
		maahishmati_Army = new Maahishmati_Army();
		
		
		logger = LoggerClass.getLocalLogger(Test_VCS_Repository.class.getName());
	}
	
	/**
     * Set all class objects to null
     */
	@AfterClass
	public static void tearDown(){
		maahishmati_Army = null;
		logger = null;
	}
	
	/**
	 * To test Positive Scenario with correct input
	 */
	@Test
	public void Test_isArmyReadyForBattle_Positive() {

		logger.info("Positive Scenarios");
		
		/**
		 * First Input
		 */
		int noOfSoldiers = 4;
		Integer countOfWeaponsEachSoldierHaving[] = { 11, 12, 12, 14 };
		String expected = "READY FOR BATTLE";

		output = maahishmati_Army.isArmyReadyForBattle(noOfSoldiers,
				countOfWeaponsEachSoldierHaving);

		assertEquals("Comparing Expected and Output", expected, output);

		/**
		 * Second Input
		 */
		noOfSoldiers = 5;
		countOfWeaponsEachSoldierHaving = new Integer[] { 2, 3, 4, 5, 5 };
		expected = "NOT READY";

		output = maahishmati_Army.isArmyReadyForBattle(noOfSoldiers,
				countOfWeaponsEachSoldierHaving);

		assertEquals("Comparing Expected and Output", expected, output);
	}
	
	/**
	 * To test Negative Scenario with wrong input
	 */
	@Test
	public void Test_isArmyReadyForBattle_Negative() {

		logger.info("Negative Scenarios");
		
		int noOfSoldiers = 5;
		Integer countOfWeaponsEachSoldierHaving[] = { 2, 3, 4, 5, 5, 4 };
		String expected =  "Wrong Input";//"NOT READY";

		String output = maahishmati_Army.isArmyReadyForBattle(noOfSoldiers, countOfWeaponsEachSoldierHaving);

		assertEquals("Comparing Expected and Output", expected, output);
	}

}
