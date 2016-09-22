package com.example.CommandPattern;

public class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

	public CloseFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

}
