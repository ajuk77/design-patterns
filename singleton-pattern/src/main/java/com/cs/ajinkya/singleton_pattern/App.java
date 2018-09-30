package com.cs.ajinkya.singleton_pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        print("s1", s1);
        print("s2", s2);
    }

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s, HashCode : %s ", name, object.hashCode()));
	}
}
