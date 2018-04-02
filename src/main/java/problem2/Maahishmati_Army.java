package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import util_package.LoggerClass;

public class Maahishmati_Army {

	ArrayList<Integer> soldiers_weapons_count;
	String output;
	
	/** The logger. */
    private Logger logger;
    
    /**
     * Instantiates a new Maahishmati_Army
     */
    public Maahishmati_Army() {
    	
    	/** Initializing logger*/
		logger = LoggerClass.getLocalLogger(this);
	}
	
	
	/**
	 * Checkes whether Army is ready for battle or not
	 * @param noOfSoldiers Number of soldiers
	 * @param countOfWeaponsEachSoldierHaving an array A1, A2, ..., AN, where Ai  denoted number of weapons ith soldier is having
	 * @return returns whether Army is ready for battle or not
	 */
	public String isArmyReadyForBattle(int noOfSoldiers, Integer countOfWeaponsEachSoldierHaving[]) {
		output = null;
		
		logger.info("Total number of Soldiers " + noOfSoldiers);
		
		/**
		 * Validating the input
		 */
		if(noOfSoldiers == countOfWeaponsEachSoldierHaving.length){
			soldiers_weapons_count = new ArrayList<>(Arrays.asList(countOfWeaponsEachSoldierHaving));
			
			/**Lucky Soldier counter */
			int lucky_soldier_counter = 0;

			for (Integer i : soldiers_weapons_count) {
				
				/**
				 * Check if soldier is having even number of weapons
				 */
				if (i % 2 == 0) {
					lucky_soldier_counter++;
				}
			}

			/**
			 * Check if lucky soldier are strictly greater than unlucky soldiers
			 */
			if (lucky_soldier_counter > (noOfSoldiers / 2)) {
				output = "READY FOR BATTLE";
			} else {
				output = "NOT READY";
			}
		}else{
			logger.info("Number of soldier and size of countOfWeaponsEachSoldierHaving is not matching");
			output = "Wrong Input" ;
		}
		
		logger.info("Result :- "+output);
		return output;
	}
}