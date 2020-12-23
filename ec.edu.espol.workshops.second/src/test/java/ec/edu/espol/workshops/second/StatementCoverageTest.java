package ec.edu.espol.workshops.second;

import ec.edu.espol.workshops.second.models.Customer;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
	private Customer customer;
	
	@Test
	   public void youngManNoMarried() {	
	      System.out.println("Young man no married");   
	      customer= new Customer(20,"M",false);
	      assertEquals(2000, CarInsurance.getPremiumInsurance(customer));     
	   }
	
	@Test
	   public void femaleMarried() {	
	      System.out.println("Female married");   
	      customer= new Customer(20,"F",true);
	      assertEquals(300, CarInsurance.getPremiumInsurance(customer));     
	   }
	
	@Test
	   public void rangeAge() {	
	      System.out.println("Range Age");   
	      customer= new Customer(60,"M",false);
	      assertEquals(400, CarInsurance.getPremiumInsurance(customer));     
	   }
	
	@Test
	   public void insurancePrime() {	
	      System.out.println("Insurance Prime");   
	      customer= new Customer(30,"M",false);
	      assertEquals(500, CarInsurance.getPremiumInsurance(customer));     
	   }
	
	@Test
	   public void notValidCarInsurance() {	
	      System.out.println("Not valid car insurance");   
	      customer= new Customer(90,"M",false);
	      assertEquals(-1, CarInsurance.getPremiumInsurance(customer));     
	   }
}
