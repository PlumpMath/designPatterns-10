package com.example.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDeSerilzationTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("EmployeeObject.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(ois.readObject());
			ois.close();
			fis.close();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
