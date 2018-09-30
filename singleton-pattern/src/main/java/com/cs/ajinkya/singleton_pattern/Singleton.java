package com.cs.ajinkya.singleton_pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	// using volatile keyword in multi threading env. Avoid creation of half baked
	// objects
	private static volatile Singleton soleInstance = null;

	private Singleton() {
		// In case of reflection
		if (null != soleInstance) {
			throw new RuntimeException("Cannot create, please use getInstance()");
		}
		// proceed with creation
		System.out.println("Creating an instance");
	}

	// In case of multithreading
	public static Singleton getInstance() {
		if (null == soleInstance) { // check 1
			synchronized (Singleton.class) {
				if (soleInstance == null) { // check 2: double check locking
					soleInstance = new Singleton(); // lazy initialization
				}
			}

		}
		return soleInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// In case of clonning
		return soleInstance;
	}

	// In case of serialization
	private Object readResolve() throws ObjectStreamException {
		System.out.println("Read resolved");
		return soleInstance;
	}

}
