package com.cs.ajinkya.builder_design_pattern;

public class Computer {

	// required parameters
	private String RAM;
	private String HDD;
	private String CPU;

	// optional parameters
	private boolean isWIFIEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(Builder builder) {
		this.RAM = builder.RAM;
		this.CPU = builder.CPU;
		this.HDD = builder.HDD;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isWIFIEnabled = builder.isWIFIEnabled;
	}
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
	
	public static class Builder {
		
		// required parameters
		private String RAM;
		private String HDD;
		private String CPU;

		// optional parameters
		private boolean isWIFIEnabled;
		private boolean isBluetoothEnabled;
		
		public Builder(String RAM, String HDD, String CPU) {
			this.RAM = RAM;
			this.HDD = HDD;
			this.CPU = CPU;
		}

		public void setRAM(String rAM) {
			RAM = rAM;
		}

		public void setHDD(String hDD) {
			HDD = hDD;
		}

		public void setCPU(String cPU) {
			CPU = cPU;
		}

		public Builder setWIFIEnabled(boolean isWIFIEnabled) {
			this.isWIFIEnabled = isWIFIEnabled;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
			
		}
		
	}

}
