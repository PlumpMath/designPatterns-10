package com.example.FactoryPattern;

import com.example.FactoryPattern.ComputerBuildPattern.ComputerBuilder;

/*Benefits of Factory Pattern

Factory pattern provides approach to code for interface rather than implementation check computer is an interface we are using here.
Factory pattern removes the instantiation of actual implementation classes from client code, making it more robust, less coupled and easy to extend. there is not new
of PC and server its hidden. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.
Factory Pattern Examples in JDK

java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
valueOf() method in wrapper classes like Boolean, Integer etc.
*/
public class FactoryComputerTest {

	public static void main(String[] args) {
		Computer fcs = FactoryPatternCmp.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer fcs2 = FactoryPatternCmp.getComputer("Server", "6 GB", "1500 GB", "4.4 GHz");
		System.out.println(fcs.toString());
		System.out.println(fcs2.toString());

		PCFactory pcFactory = new PCFactory("2 GB", "500 GB", "2.4 GHz");
		ServerFactoryPattern serFactory = new ServerFactoryPattern("6 GB", "150 GB", "5.4 GHz");

		Computer pc = AbstractFactoryPatternCmp.getComputer(pcFactory);
		Computer server = AbstractFactoryPatternCmp.getComputer(serFactory);

		System.out.println("AbstractFactory PC Config::" + pc.toString());
		System.out.println("AbstractFactory Server Config::" + server.toString());

		ComputerBuildPattern comp = new ComputerBuildPattern.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(false).build();
		System.out.println(comp.toString());
	}

}
