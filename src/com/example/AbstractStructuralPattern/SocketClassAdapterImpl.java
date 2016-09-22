package com.example.AbstractStructuralPattern;

/*
 While implementing Adapter pattern, there are two approaches – class adapter and object adapter, however both these approaches produce same result.

Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
Object Adapter – This form uses Java Composition and adapter contains the source object.

 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int i) {
		Volt v = new Volt(volt.getVolts() / i);
		return v;
	}

}
