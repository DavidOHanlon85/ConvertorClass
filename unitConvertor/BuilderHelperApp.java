/**
 * 
 */
package unitConvertor;

import simpleCalc.SimpleCalc;

/**
 * 
 */
public class BuilderHelperApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnitConvertor uc = new UnitConvertor();
		
		//System.out.println(UnitConvertor.INCHES_TO_CM);
		
		double result = uc.cmToInches(5);
		System.out.printf("%.2f inches%n", result);
	}

}
