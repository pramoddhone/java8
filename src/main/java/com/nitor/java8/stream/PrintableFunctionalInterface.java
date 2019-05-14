package com.nitor.java8.stream;


/**
 * Functional interface can contain only one abstract method as it mainly used for lambda expression 
 * @author pramod.dhone
 *
 */
@FunctionalInterface
public interface PrintableFunctionalInterface {
	void print(String display);
	
	default void display(String display) {
		System.out.println("Display ");
	}
	
	static void display2(String display) {
		System.out.println("Display 2");
	}
}
