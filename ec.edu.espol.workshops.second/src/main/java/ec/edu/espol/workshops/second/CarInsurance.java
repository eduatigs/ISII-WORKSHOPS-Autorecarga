package ec.edu.espol.workshops.second;

import ec.edu.espol.workshops.second.constants.Constants;
import ec.edu.espol.workshops.second.models.Customer;
/*CLase que maneja la prima*/
public class CarInsurance {
	
	/*Obiene el valor de la prima*/
	public  static float getPremiumInsurance(Customer customer) {
		System.out.println(customer);
		if(isValidCarInsurance(customer)) {
			return calculateCarInsurance(customer);
		}else {
			return -1.0f;
		}
	}
	private static float calculateCarInsurance(Customer customer) {
		float total = Constants.BASE_PREMIUM;
		if(customer.getAge() < Constants.YOUNG_AGE && !customer.isMaritalStatus() && customer.getSex().equals(Constants.MALE_SEX)){
			total = total + Constants.ADD_PREMIUM_FOR_YOUNGER_NOT_MARRIED;
		}else if(customer.getSex().equals(Constants.FEMALE_SEX) && customer.isMaritalStatus()) {
			total = total - Constants.SUBSTRACT_PREMIUM_FOR_FEMALE_MARRIED;
		}else if(customer.getAge() >= Constants.MID_MIN_AGE_FOR_RANGE && customer.getAge() < Constants.MID_MAX_AGE_FOR_RANGE) {
			total = total - Constants.SUBSTRACT_PREMIUM_FOR_RANGE_AGE;
		}
		return total;
	}
	private static boolean isValidCarInsurance(Customer customer) {
		return customer.getAge() <= Constants.MAX_AGE_FOR_INSURANCE && Constants.IS_REQUIRED_LICENSE;	
	}

}
