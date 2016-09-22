package com.example.singleton;

import java.io.Closeable;
import java.io.IOException;

public enum ThreadStatesEnum implements Closeable {
	START(0) {

		public String toString() {
			return "START implementation. Priority=" + getPriority();
		}

		public String getDetail() {
			return "START";
		}
	},
	RUNNING(2) {

		public String getDetail() {
			return "RUNNING";
		}
	},
	WAITING(3) {

		public String getDetail() {
			return "WAITING";
		}
	},
	DEAD(4) {

		public String getDetail() {
			return "Already DEAD";
		}
	};

	private int priority;

	public abstract String getDetail();

	// Enum constructors should always be private.
	private ThreadStatesEnum(int i) {
		priority = i;
	}

	// Enum can have methods
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int p) {
		this.priority = p;
	}

	// Enum can override functions
	public String toString() {
		return "Default ThreadStatesConstructors implementation. Priority=" + getPriority();
	}

	public void close() throws IOException {
		System.out.println("Close of Enum");
	}
}
