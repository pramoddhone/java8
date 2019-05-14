package com.nitor.java8.datetime;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		//LocalDate used for who want Date with respect to Zone
		LocalDate localDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(localDate);
		
		localDate = LocalDate.now();
		System.out.println(localDate);
		localDate = LocalDate.ofEpochDay(365);
		System.out.println(localDate);
		
		
		
	}
}
