package com.practice.spring.springpractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.spring.springpractice1.Basic.BinarySearchImpl;

//@SpringBootApplication
public class SpringPractice1ApplicationBasic {

	public static void main(String[] args) {
		
		/*
		SortingAlgo bubblesort=new BubbleSortAlgo();
		SortingAlgo quicksort=new QuickSortAlgo();
		
		BinarySearchImpl binarysearch1=new BinarySearchImpl(bubblesort);
		BinarySearchImpl binarysearch2=new BinarySearchImpl(quicksort);
		
		binarysearch1.binarySearch(new int[] {1,2,3}, 3);
		binarysearch2.binarySearch(new int[] {1,2,3}, 3);
		*/
		ApplicationContext mn= SpringApplication.run(SpringPractice1ApplicationBasic.class, args);
		BinarySearchImpl binarysearch1=mn.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarysearch2=mn.getBean(BinarySearchImpl.class);
		binarysearch1.binarySearch(new int[] {1,2,3}, 3);
		binarysearch2.binarySearch(new int[] {1,2,3}, 3);
		
	}

}
