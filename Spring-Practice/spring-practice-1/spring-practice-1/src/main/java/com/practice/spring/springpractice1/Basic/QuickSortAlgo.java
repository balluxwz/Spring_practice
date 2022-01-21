package com.practice.spring.springpractice1.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary

/*
* we can use @Primary to make one component primary or we can also use @Qualifier
*/
@Qualifier("quick")
public class QuickSortAlgo implements SortingAlgo{
	
	public int[] sort(int[] arr){
		//sort the arr and return
		return arr;
	}

}
