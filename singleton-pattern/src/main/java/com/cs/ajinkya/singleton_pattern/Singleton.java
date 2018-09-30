package com.cs.ajinkya.singleton_pattern;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	private static Singleton soleInstance = new Singleton();
	
	private Singleton() {
		System.out.println("Creating an instance");
	}
	
	public static Singleton getInstance() {
		return soleInstance;
	}

}
