package com.example.AbstractStructuralPattern;

public class SocketObjectAdapterImpl implements SocketAdapter {
	// Using Composition for adapter pattern
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertToVolt(sock.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertToVolt(sock.getVolt(), 40);
	}

	private Volt convertToVolt(Volt volt, int i) {
		Volt v = new Volt(volt.getVolts() / i);
		return (v);
	}
}
