package com.slava.spring.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {		
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		
		int result = binarySearchImpl.binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8);
		System.out.println(result);
	}
}
