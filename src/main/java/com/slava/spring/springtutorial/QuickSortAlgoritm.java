package com.slava.spring.springtutorial;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgoritm implements SortAlgoritm {

	@Override
	public int[] sort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}
