package model.computerfile;

import model.author.Author;
import model.bibliography.Bibliography;

public class ComputerFile extends Bibliography{
	private String dateCreated;
    private String format;
//    double fileSize;
    
    private Pdf pdf;
    public ComputerFile(String title, Author author, String subject, String dateCreated, String format, Pdf pdf){
        super(title, author, subject);
        this.dateCreated = dateCreated;
        this.format = format;
        this.pdf=pdf;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }

    public String getFormat() {
        return format;
    }

	public double getFileSize() {
		return this.pdf.getFileSize();
	}

	public Pdf getPdf() {
		return pdf;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setFormat(String format) {
		this.format = format;
	}

//	public void setFileSize(double fileSize) {
//		this.fileSize = fileSize;
//	}

	public void setPdf(Pdf pdf) {
		this.pdf = pdf;
	}
    
    

    
}



