package com.cs.ajinkya.builder_design_pattern;

public class Computer {

	// required parameters
	private String RAM;
	private String HDD;
	private String CPU;

	// optional parameters
	private boolean isWIFIEnabled;
	private boolean isBluetoothEnabled;
	
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getCPU() {
		return CPU;
	}
	public boolean isWIFIEnabled() {
		return isWIFIEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

}
