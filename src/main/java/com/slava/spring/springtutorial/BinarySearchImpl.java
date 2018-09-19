package com.slava.spring.springtutorial;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgoritm algoritm;
	
	public int binarySearch(int[] array, int numberToSearch) {
		algoritm.sort(array);
		System.out.println(algoritm);
		
		return Arrays.binarySearch(array, numberToSearch);
	}
}
