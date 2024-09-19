/**
 * 
 */
package unitConvertor;

/**
 * 
 */
public class UnitConvertor {

	
	/**
	 * Conversion factor for cm to inches
	 */
	private static final double CM_TO_INCHES = 0.394;
	/**
	 * Conversion factor for inches to cm
	 */
	private static final double INCHES_TO_CM = 2.54;

	
	/**
	 * Converts from cm to inches
	 * @param cm the input value in cm units
	 * @return equivalent inches value
	 */
	public double cmToInches(double cm) {
		return cm * CM_TO_INCHES;
	}
	
	/**
	 * Converts from inches to cm
	 * @param inches the input value in inches units
	 * @return equivalent cm value
	 */
	public double inchesToCms(double inches) {
		return inches * INCHES_TO_CM;
	}

}
