package com.cs.ajinkya.singleton_pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        print("s1", s1);
        print("s2", s2);
        
        //Reflection
        Class clazz = Class.forName("com.cs.ajinkya.singleton_pattern.Singleton");
        Constructor<Singleton> ctor = clazz.getDeclaredConstructor(null);
        ctor.setAccessible(true);
        Singleton s3 = ctor.newInstance(null);
        print("s3", s3);
        
        //Serialization Example
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
        stream.writeObject(s2);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
        Singleton s4 = (Singleton) inputStream.readObject();
        print("s4", s4);
    }

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s, HashCode : %s ", name, object.hashCode()));
	}
}
