package com.chonk.hellogit;

public class HelloGit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, Git!");
		
		Box<Integer> myBox = new Box<Integer>();
		myBox.add(123);
		myBox.inspect("some text");
		
		System.out.println(myBox.get());
		
		//Working on generics
		
	}
	
}