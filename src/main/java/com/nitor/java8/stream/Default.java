package com.nitor.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * If call implementing multiple interfaces which contain default method with same signature then 
 * that class should override same method 
 * @author pramod.dhone
 *
 */
public class Default implements PrintableFunctionalInterface, DefaultInterface {

	private String displayName;

	public Default(String displayName) {
		super();
		this.displayName = displayName;
	}

	public Default() {
		super();
	}

	public static void main(String[] args) {
		Default default1 = new Default("default1");
		Default default2 = new Default("default2");
		Default default3 = new Default("default3");
		Default default4 = new Default("default4");
		List<Default> defaults = Arrays.asList(default1, default2, default3, default4);
		defaults.stream().filter(defaultObj -> defaultObj.displayName == "default1").forEach((defaultObj) -> {
			if(defaultObj.displayName=="default1")
				System.out.println(defaultObj.displayName);
		});
		;
	}

	@Override
	public void print(String display) {

	}

	@Override
	public void display(String display) {
		PrintableFunctionalInterface.super.display(display);
	}

}
