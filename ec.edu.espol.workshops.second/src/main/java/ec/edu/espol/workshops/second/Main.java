import java.util.Scanner;

import ec.edu.espol.workshops.second.models.Customer;

public class Main {
	
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner (System.in); 
		CarInsurance carInsurance = new CarInsurance();
		System.out.println ("Ingrese los datos del Custumer:");
		
		System.out.println ("Ingrese la edad:");
	    String edad = entradaEscaner.nextLine (); 
	    
		System.out.println ("Ingrese el sexo:");
		String sex = entradaEscaner.nextLine (); 
	    
		System.out.println ("Ingrese el Marital Status:");
		String maritalStatus = entradaEscaner.nextLine (); 
		boolean maritalStatusBool=maritalStatus=="true";
		int age = Integer.parseInt(edad);
	    if (!(sex == "M" || sex == "F")) {
	    	System.out.println ("Sexo del Custumer incorrecto debe ser F o M");
	    }else if ((0 < age  && age < 100 )) {
	    	System.out.println ("Edad del Custumer incorrecto debe ser entre 0 y 100");
	    }else {
	    	Customer customer=new Customer(age, sex, maritalStatusBool );
	    	float insurance = carInsurance.getPremiumInsurance(customer);	
			System.out.println("Premium Insurance: "+insurance);

	    }
	}
}
