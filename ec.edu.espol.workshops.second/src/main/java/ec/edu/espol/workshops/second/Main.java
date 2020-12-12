package ec.edu.espol.workshops.second;
import ec.edu.espol.workshops.second.models.Customer;
import java.util.Scanner;
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
		int age = -1;
		try {
			age = Integer.parseInt(edad);
		}catch(NumberFormatException ex) {
			System.out.println("Datos mal ingresados, vuelva a ingresarlos");
		}
		
		Customer customer=new Customer(age, sex, maritalStatusBool );
    	float insurance = carInsurance.getPremiumInsurance(customer);	
		System.out.println("Premium Insurance: "+insurance);
	}
}
