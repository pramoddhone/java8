package com.nitor.java8.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocaleTimeDemo {

	public static void main(String[] args) {
		//LocalTime used for who want Time with respect to Zone
		
		//Printing Zone
		ZoneId.getAvailableZoneIds().stream().forEach((zone)->{
			System.out.println("ZoneId:"+zone);
		});
		
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		
		
		LocalTime localZoneTime = LocalTime.now(ZoneId.of("US/Pacific"));
		System.out.println(localZoneTime);
		
	}
}
