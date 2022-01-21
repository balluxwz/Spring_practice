package com.practice.spring.springpractice1.Basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	@Autowired
	@Qualifier("quick")
	SortingAlgo sortingAlgo;

	/*
	 * It is example of construction injection we use this for mandatory dependency
	 
	public BinarySearchImpl(SortingAlgo sortingAlgo) {
		super();
		// TODO Auto-generated constructor stub
		this.sortingAlgo=sortingAlgo;
	}

	 * It is example of setter injection we use this for non-mandatory dependency
	 
	public void setSortingAlgo(SortingAlgo sortingAlgo) {
		this.sortingAlgo = sortingAlgo;
	}
    
	 * But now we don't need any of these two
	 */


	public int binarySearch(int[] arr,int x) {
		//sort arr
		//search for x in arr
		//return index of x in arr
		
		sortingAlgo.sort(arr);
		System.out.println(sortingAlgo);
		
		return 3;
	}
	
	/*
	 * Just after the bean is created this method will be called first
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");
	}
	
	/*
	 * Just before bean gets destroyed this method will be called
	 */
	@PreDestroy
	public void preDistroyed() {
		System.out.println("preDistroyed");
	}

}
