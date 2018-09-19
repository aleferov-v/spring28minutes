package com.slava.spring.springtutorial;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgoritm implements SortAlgoritm {

	public int[] sort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}
