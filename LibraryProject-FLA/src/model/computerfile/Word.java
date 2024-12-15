package model.computerfile;

import model.author.Author;

public class Word {

	
	private double fileSize;
	
	public Word(double fileSize) {
		super();
		this.fileSize = fileSize;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	
}
