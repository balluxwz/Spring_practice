package com.practice.spring.springpractice1.Basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.practice.spring.springpractice1.SpringPractice1ApplicationBasic;


@ContextConfiguration(classes = SpringPractice1ApplicationBasic.class )
public class BinarySearchTest {
	
	@Autowired
	BinarySearchImpl binarysearch;

	@Test
	public void test() {
		BinarySearchImpl binarysearch2=new BinarySearchImpl();
		int result=binarysearch2.binarySearch(new int[] {1,2,3}, 1);
		assertEquals(3,result);
		
	}

}
