/**
 * 
 */
package com.flikart.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cyrus.dwivedi
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList implementation
		
		//ArrayList <String>list = new ArrayList<String>();
		List <String>list=new ArrayList<String>();
		
		//create or add
		System.out.println("size of collection before allocation --> " +list.size());
		
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Delhi");
		list.add("maldives");
		list.add("Sri Lanka");
		list.add("one two three");
		
		System.out.println("size of collection after allocation --> " +list.size());
		
		
		// Remove collection object with value & index 
		 
		list.remove("Delhi");
				 
		System.out.println("After Removeal size of collection here -->" +list.size());
		
		
		// list of object printed
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			String var = i.next();
			System.out.println("Details -->"+var);
		}
		
		//new way onwards java 8
		
		for(String var: list) {
			
			System.out.println("Details of cities using new way-->"+var);
		}

	}

}
