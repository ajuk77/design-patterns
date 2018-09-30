package com.cs.ajinkya.singleton_pattern;

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
    }

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s, HashCode : %s ", name, object.hashCode()));
	}
}
