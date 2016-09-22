package com.example.FactoryPattern;

public class ServerFactoryPattern implements ComputerAbstractFactoryPattern {
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactoryPattern(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
