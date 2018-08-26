package com.cs.ajinkya.builder_design_pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer computer = new Computer.Builder("16gb","500gb","4").build();
        System.out.println("Building Computer 1 -- ");
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("CPU:" +computer.getCPU());
        System.out.println("HDD:" + computer.getHDD());
        
        Computer computer2 = new Computer.Builder("8gb", "500gb", "4").setBluetoothEnabled(true).setWIFIEnabled(true).build();
        System.out.println();
        System.out.println("Building computer 2 -- ");
        System.out.println("RAM: " + computer2.getRAM());
        System.out.println("CPU:" +computer2.getCPU());
        System.out.println("HDD:" + computer2.getHDD());
        System.out.println("Bluetooth Enabled: " + computer2.isBluetoothEnabled());
        System.out.println("Wifi Enabled: " + computer2.isWIFIEnabled());
        
    }
}
