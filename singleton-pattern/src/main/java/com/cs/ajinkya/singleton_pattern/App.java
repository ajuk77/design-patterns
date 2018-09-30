package com.cs.ajinkya.singleton_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1", s1);
		print("s2", s2);

		//usingReflection();

		usingSerialization(s2);

		usingSingleton(s2);

		usingMultithreading();

	}

	private static void usingMultithreading() {
		// Multithreaded environment
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(App::useSingleton);
		service.submit(App::useSingleton);

		service.shutdown();
	}

	private static void usingSingleton(Singleton s2) throws CloneNotSupportedException {
		// Using Clone
		Singleton s5 = (Singleton) s2.clone();
		print("s5", s5);
	}

	private static void usingSerialization(Singleton s2)
			throws IOException, FileNotFoundException, ClassNotFoundException {
		// Serialization Example
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
		stream.writeObject(s2);
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
		Singleton s4 = (Singleton) inputStream.readObject();
		print("s4", s4);
	}

	private static void usingReflection() throws ClassNotFoundException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		// Reflection
		Class clazz = Class.forName("com.cs.ajinkya.singleton_pattern.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor(null);
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance(null);
		print("s3", s3);
	}

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s, HashCode : %s ", name, object.hashCode()));
	}

	static void useSingleton() {
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
}
