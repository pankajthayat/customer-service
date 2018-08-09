package com.pankaj.microservice.customerservice;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceApplicationTests {
	CustomerController controller=new CustomerController();

	@Test
	public void testFindById() {
	//	CustomerBean x=controller.findById(1);
		//Assert.assertEquals(x,controller.findById(1), new CustomerBean(1, "pankaj", "banglore", "karnataka", 102030, 30));

	}

}
