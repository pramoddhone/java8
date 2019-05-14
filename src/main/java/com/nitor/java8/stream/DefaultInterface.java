package com.nitor.java8.stream;

public interface DefaultInterface {
	
	default void display(String display) {
		System.out.println("Display");
	}

}
