package com.example.CommandPattern;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

	public WriteFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

}
