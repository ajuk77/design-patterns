package com.cs.ajinkya.singleton_pattern;

public class Singleton {
	
	private static Singleton soleInstance = new Singleton();
	
	private Singleton() {
		System.out.println("Creating an instance");
	}
	
	public static Singleton getInstance() {
		return soleInstance;
	}

}
