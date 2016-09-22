package com.example.singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerializationTest {

	public static void main(String[] args) {
		EmployeeObject emp = new EmployeeObject();

		emp.setAge(10);
		emp.setGender("Male");
		emp.setName("Sudhan");

		try {
			FileOutputStream fos = new FileOutputStream("EmployeeObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EmployeeObject.ser"));
			// write object to file
			oos.writeObject(emp);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
