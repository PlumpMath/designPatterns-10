package com.example.Prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.addToList();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("TestPrototype");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Sudhan");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
