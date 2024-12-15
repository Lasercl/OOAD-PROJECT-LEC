package adapter;

import model.computerfile.Pdf;
import model.computerfile.Word;

public class PdfToWord extends Word{
	private Pdf pdf;

	public PdfToWord(double fileSize) {
		super(fileSize);
		pdf=new Pdf(fileSize);
		// TODO Auto-generated constructor stub
	}
	public double getFileSize() {
		return this.pdf.getFileSize()*2;
	}
	

}
