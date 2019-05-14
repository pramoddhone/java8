package com.nitor.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachMethodDemo {

	public static void main(String[] args) {

		//forEach loop with lambda
		//Solution 1
		List<Integer> numberList = Arrays.asList(12,43,44,12,34);
		numberList.forEach((num)->{
			System.out.format("Squaring of num %d : %d%n",num,(num*num));
		});
		
		numberList.forEach((i)->System.out.println(i*i));
		
		numberList.forEach(System.out::println);
		
		numberList.stream().peek(i->System.out.println(i*i)).collect(Collectors.toList());
	}

}
