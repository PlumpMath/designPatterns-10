package com.example.CommandPattern;

public class FileSystemClient {
	public static void main(String[] args) {
		// Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtilFactoryPattern.getUnderlyingFileSystem();

		// creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		openFileCommand.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		writeFileCommand.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		closeFileCommand.execute();
	}
}
