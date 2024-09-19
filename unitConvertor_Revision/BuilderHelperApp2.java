/**
 * 
 */
package unitConvertor_Revision;

/**
 * 
 */
public class BuilderHelperApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnitConvertor2 uc = new UnitConvertor2();
		
		double test1 = uc.cmToInches(123);
		
		double test2 = uc.inchesToCms(34);
		
		double test3 = uc.kmToMiles(21.1);
		
		double test4 = uc.milesToKms(26.2);
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);

	}

}
