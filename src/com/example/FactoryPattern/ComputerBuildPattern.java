package com.example.FactoryPattern;

public class ComputerBuildPattern {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	// Private constructor access only through builder
	private ComputerBuildPattern(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String toString() {
		return "The values are " + HDD + " Ram as " + RAM + " optional paramters isGraphicsCardEnabled"
				+ isGraphicsCardEnabled + " isBluetoothEnabled " + isBluetoothEnabled;
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		// construcotr only for the mandatory fields for non mandatory just can
		// create a setter.
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		// The final step is to provide a build() method in the builder class
		// that will return the Object needed by
		// client program. For this we need to have a private constructor in the
		// Class with Builder class as argument.
		public ComputerBuildPattern build() {
			return new ComputerBuildPattern(this);
		}

	}

}
