package ec.edu.espol.workshops.second;

import ec.edu.espol.workshops.second.models.Customer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class PathCoverageTest {
	private Customer customer;
	
	@Test
	   public void caso1() {	
	      customer= new Customer(20,"M",false);
	      assertEquals(2000, CarInsurance.getPremiumInsurance(customer), 0.1);     
	   }
	
	@Test
	   public void caso2() {	
	      customer= new Customer(30,"F",true);
	      assertEquals(300, CarInsurance.getPremiumInsurance(customer), 0.1);     
	   }
	
	@Test
	   public void caso3() {	
	      customer= new Customer(60,"M",true);
	      assertEquals(400,CarInsurance.getPremiumInsurance(customer), 0.1);     
	   }
	@Test
	   public void caso4() {	
	      customer= new Customer(20,"F",false);
	      assertEquals(500,CarInsurance.getPremiumInsurance(customer), 0.1);     
	   }
	
	@Test
	   public void caso5() {	
	      customer= new Customer(90,"M",false);
	      assertEquals(-1,CarInsurance.getPremiumInsurance(customer), 0.1);     
	   }
	
}
