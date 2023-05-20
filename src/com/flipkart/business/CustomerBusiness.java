/**
 * 
 */
package com.flipkart.business;

import java.util.ArrayList;
import java.util.List;
import com.flipkart.bean.Customer;
/**
 * @author cyrus.dwivedi
 *
 */
public class CustomerBusiness implements CustomerInterface{
	
	
	List <Customer>customers = new ArrayList<Customer>();
	
	public void createCustomer (int customerID, String name, String address, String email) {
		
		Customer customer1 = new Customer();
		customer1.setCustomerID(customerID);
		customer1.setCustomerName(name);
		customer1.setCustomerAddress(address);
		customer1.setEmail(email);
		
		// add in collection
		
		customers.add(customer1);
		
		System.out.println("Successfully Created!!");
		
//		Customer customer2 = new Customer();
//		customer2.setCustomerID(102);
//		customer2.setCustomerName("Aryan");
//		customer2.setCustomerAddress("UP");
//		customer2.setEmail("aryan@");
//		
//		//add in collection
//		
//		customers.add(customer2);
		
	}
	
	public boolean updateCustomer(int customerID, String name, String address, String email) {
		boolean flag = false;
		for(Customer cust : customers) {
			if(cust.getCustomerID() == customerID) {
				cust.setCustomerName(name);
				cust.setCustomerAddress(address);
				cust.setEmail(email);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean deleteCustomer (int customerID) {
		boolean flag = false;
		for(Customer cust : customers) {
			if(cust.getCustomerID() == customerID) {
				customers.remove(cust);
				flag = true;
				break;
			}
		}

		return flag;
	}
	
	public void listCustomer() {
		System.out.println("List of Customer-->");
		
		for(Customer cust : customers) {
			System.out.println("Name:-->"+cust.getCustomerName());
			System.out.println("Id of Customer:-->"+cust.getCustomerID());
			System.out.println("Address:-->"+cust.getCustomerAddress());
			System.out.println("Email:-->"+cust.getEmail());
			System.out.println();
		}
		
		
	}

}
