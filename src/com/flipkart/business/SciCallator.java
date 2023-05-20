/**
 * 
 */
package com.flipkart.business;
import java.lang.Math;
/**
 * @author cyrus.dwivedi
 *
 */
public class SciCallator extends Calculatorbuisness{
	
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
	
	public double sine(double a) {
		double radians = Math.toRadians(a);
        return Math.sin(radians);
	}
	
	public double cosine(double a) {
		double radians = Math.toRadians(a);
        return Math.cos(radians);
	}
	
	public double tangent(double a) {
		double radians = Math.toRadians(a);
        return Math.tan(radians);
	}
	
	public double exponent(double a) {
		return Math.exp(a);
	}
	
	
}
