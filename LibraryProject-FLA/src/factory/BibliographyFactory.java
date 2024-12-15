package factory;


import adapter.WordToPdf;
import model.artwork.Artwork;
import model.author.Author;
import model.bibliography.Bibliography;
import model.book.Book;
import model.computerfile.ComputerFile;
import model.computerfile.Pdf;
import model.computerfile.Word;

public class BibliographyFactory {
	public Bibliography makeBook(String title, Author author, String subject, String bookID, int yearPublish, String publisher,
			String edition, int page, String genre) {
		 BookFactory newBl=new BookFactory();
		 Book newBook=newBl.createBook(title, author, subject, bookID, yearPublish, publisher, edition, page, genre);
		 return newBook;
	}
	public Bibliography makeArtwork(String title, Author author, String subject,
	    		int year, String artType, String artStyle, String artMovement) {
		ArtworkFactory newArt= new ArtworkFactory();
		Artwork art=newArt.createArtwork(title, author, subject, year, artType, artStyle, artMovement);
		return art;
	}
	public Bibliography makeComputerFile(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
		ComputerFileFactory newCf=new ComputerFileFactory();
		ComputerFile cf=newCf.createCf(title, author, subject, dateCreated, format, fileSize);
		return cf;
	}
//	public Bibliography makeComputerFilePdf(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
//		ComputerFileFactory newCf=new ComputerFileFactory();
//		ComputerFile cf=newCf.createCfPdf(title, author, subject, dateCreated, format, fileSize);
//		return cf;
//	}
//	public Bibliography makeComputerFileWord(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
//		ComputerFileFactory newCf=new ComputerFileFactory();
//		ComputerFile cf=newCf.createCfWord(title, author, subject, dateCreated, format, fileSize);
//		return cf;
//	}
//	public Bibliography makeComputerFile(String title, Author author, String subject, String dateCreated, String format, double fileSize,Word word) {
//		ComputerFileFactory newCf=new ComputerFileFactory();
//		ComputerFile cf=newCf.createCf(title, author, subject, dateCreated, format, fileSize, word);
//		return cf;
//	}
	
}
