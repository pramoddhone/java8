package com.nitor.java8.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo {

	public static void main(String[] args) {
		//Instant used for Machine time(Unix Time)
		Instant instant = Instant.now();
		System.out.println(instant);
		Instant instantWithZone = Instant.now(Clock.system(ZoneId.of("US/Pacific")));
		System.out.println(instantWithZone);
		
	}
}
