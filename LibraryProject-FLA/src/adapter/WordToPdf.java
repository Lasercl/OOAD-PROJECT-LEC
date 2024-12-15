package adapter;

import model.computerfile.Pdf;
import model.computerfile.Word;

public class WordToPdf extends Pdf{
	private Word word;
	public WordToPdf(double fileSize) {
		super(fileSize);

		word=new Word(fileSize);
		
		// TODO Auto-generated constructor stub
		
	}
	public double getFileSize() {
		return this.word.getFileSize()/2;
	}
	
}

