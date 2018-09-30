package com.cs.ajinkya.singleton_pattern;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	
	private static Singleton soleInstance = null;
	
	private Singleton() {
		System.out.println("Creating an instance");
	}
	
	public static Singleton getInstance() {
		if(null == soleInstance) {
			soleInstance = new Singleton(); // lazy initialization
		}
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
