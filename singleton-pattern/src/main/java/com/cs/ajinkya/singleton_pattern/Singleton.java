package com.cs.ajinkya.singleton_pattern;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	
	private static Singleton soleInstance = new Singleton();
	
	private Singleton() {
		System.out.println("Creating an instance");
	}
	
	public static Singleton getInstance() {
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
