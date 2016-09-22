package com.example.CommandPattern;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public OpenFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	public FileSystemReceiver getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(FileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.getFileSystem().openFile();
	}

}
