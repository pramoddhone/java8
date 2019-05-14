package com.nitor.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		//LocalDateTime used for who want Date Time with respect to Zone
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		LocalDateTime dateTimeWithZone  = LocalDateTime.now(ZoneId.of("US/Pacific"));
		System.out.println(dateTimeWithZone);
	}
}
