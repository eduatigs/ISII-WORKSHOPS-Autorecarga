package ec.edu.espol.workshops.second.constants;

/**
*
*
* @author Anyuel Astudillo
*/
public final class Constants {
	
	/**
	*
	*
	* Base para el calculo de la prima
	*/
	public static final float BASE_PREMIUM = 500f;
	/**
	*
	*
	* Maxima edad para obtner el seguro
	*/
	public static final int MAX_AGE_FOR_INSURANCE = 80;
	public static final int YOUNG_AGE = 25;
	public static final int MID_MIN_AGE_FOR_RANGE = 45;
	public static final int MID_MAX_AGE_FOR_RANGE = 65;

	public static final boolean IS_REQUIRED_LICENSE = true;
	public static final float SUBSTRACT_PREMIUM_FOR_FEMALE_MARRIED = 200f;
	public static final float SUBSTRACT_PREMIUM_FOR_RANGE_AGE = 100f;
	public static final float ADD_PREMIUM_FOR_YOUNGER_NOT_MARRIED = 1500f;
	public static final String FEMALE_SEX = "F";
	public static final String MALE_SEX = "M";

	private Constants() {
	    throw new IllegalStateException("Utility class");
	  }
	
	
	
	
}
