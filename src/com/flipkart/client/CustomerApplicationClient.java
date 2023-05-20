/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;
import java.util.*;
/**
 * @author cyrus.dwivedi
 *
 */
public class CustomerApplicationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the instance of Customer Buiseness class here
		
		//CustomerBusiness business = new CustomerBusiness();
		
		CustomerInterface business = new CustomerBusiness();
		
		Scanner scn = new Scanner(System.in);
		boolean interactWithClient = true;
		while(interactWithClient) {
		System.out.println("1. Create Customer");
		System.out.println("2. List Customer");
		System.out.println("3. Update Customer");
		System.out.println("4. Delete Customer");
		System.out.println("5. Exit");
		
		System.out.println("Enter your Choice:-->");
		
		int choice = scn.nextInt();
		
		switch(choice){
		
		case 1:
			System.out.println("Enter the id of Customer-->");
			int id =scn.nextInt();
			System.out.println("Enter the Name:-->");
			String name = scn.next();
			System.out.println("Enter the address:-->");
			String address = scn.next();
			System.out.println("Enter the Email:-->");
			String email = scn.next();
			business.createCustomer(id, name, address, email);
			break;
			
		case 2:
			business.listCustomer();
			break;
			
		case 3:
			System.out.println("Enter the id of Customer you want to update-->");
			int idToUpdate =scn.nextInt();
			System.out.println("Enter the Updated Name:-->");
			String updatedName = scn.next();
			System.out.println("Enter the Updated address:-->");
			String updatedAddress = scn.next();
			System.out.println("Enter the Updated Email:-->");
			String updatedEmail = scn.next();
			System.out.println(business.updateCustomer(idToUpdate,updatedName, updatedAddress, updatedEmail));
			break;
			
		case 4:
			System.out.println("Enter the id of Customer you want to delete-->");
			int idToDelete = scn.nextInt();
			System.out.println(business.deleteCustomer(idToDelete));
			break;
			
		case 5:
			interactWithClient = false;
			break;
			
		default:
			System.out.println("Enter the Correct Choice!!");
			
		}	

	}
	}

}
