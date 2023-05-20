/**
 * 
 */
package com.flipkart.business;

/**
 * @author cyrus.dwivedi
 *
 */
public interface CustomerInterface {
	
	public void createCustomer (int customerID, String name, String address, String email);
	public boolean updateCustomer (int customerID, String name, String address, String email);
	public boolean deleteCustomer (int customerID);
	public void listCustomer();
	
	
}
