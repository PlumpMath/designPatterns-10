package com.example.ProxyPattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Sudhan", "SV12345");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}
