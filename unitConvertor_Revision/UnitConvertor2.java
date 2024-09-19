/**
 * 
 */
package unitConvertor_Revision;

/**
 * 
 */
public class UnitConvertor2 {

	/**
	 * Conversion factor for cm to inches
	 */
	private static final double CM_TO_INCHES = 0.394;

	/**
	 * Conversion factor for inch to cm
	 */
	private static final double INCH_TO_CM = 2.54;

	/**
	 * Conversion factor for miles to km
	 */
	private static final double MILES_TO_KM = 1.609;

	/**
	 * Conversion factor for km to miles
	 */
	private static final double KM_TO_MILES = 0.621;

	/**
	 * Converts cms to inches
	 * @param cms
	 * @return cms converted to inches
	 */
	public double cmToInches(double cms) {
		return cms * CM_TO_INCHES;
	}
	
	/**
	 * Converts inches to cms
	 * @param inches
	 * @return inches converted to cms
	 */
	public double inchesToCms(double inches) {
		return inches * INCH_TO_CM;
	}
	
	/**
	 * Converts kms to miles
	 * @param kms
	 * @return kms converted to miles
	 */
	public double kmToMiles(double kms) {
		return kms * KM_TO_MILES;
	}
	
	/**
	 * Converts miles to kms
	 * @param miles
	 * @return miles converted to kms
	 */
	public double milesToKms (double miles) {
		return miles * MILES_TO_KM;
	}

}
