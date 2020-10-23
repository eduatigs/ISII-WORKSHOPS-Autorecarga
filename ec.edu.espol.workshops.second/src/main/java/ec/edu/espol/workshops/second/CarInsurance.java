package ec.edu.espol.workshops.second;

import ec.edu.espol.workshops.second.models.Customer;

public class CarInsurance {

	private boolean isValidCarInsurance(Customer customer) {
		if(customer.getAge() >= Constants.MAX_AGE && Constants.IS_REQUIRED_LICENSE) {
			return false;
		}
		return true;
		
	}
	
	private float calculateCarInsurance(Customer customer) {
		float total = Constants.BASE_PREMIUM;
		if(customer.getAge() < 25 && !customer.isMaritalStatus() && customer.getSex() == "M"){
			total = total + Constants.ADD_PREMIUM_FOR_YOUNGER_NOT_MARRIED;
		}else if(customer.getSex() == "F" || customer.isMaritalStatus()) {
			total = total - Constants.SUBSTRACT_PREMIUM_FOR_FEMALE_MARRIED;
		}else if(customer.getAge() >= 45 && customer.getAge() < 65) {
			total = total - Constants.SUBSTRACT_PREMIUM_FOR_RANGE_AGE;
		}
		return total;
	}
	
	public float getPremiumInsurance(Customer customer) {
		if(isValidCarInsurance(customer)) {
			return calculateCarInsurance(customer);
		}else {
			return -1;
		}
	}
}
