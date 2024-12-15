package factory;

import model.author.Author;
import model.bibliography.Bibliography;
import model.book.Book;
import model.book.ComedyBook;
import model.book.HorrorBook;
import model.book.RomanceBook;

public class BookFactory extends BibliographyFactory {
	public Book createBook(String title, Author author, String subject, String bookID, int yearPublish,
			String publisher,
			String edition, int page, String genre) {
		Book book = null;
		if (genre.equalsIgnoreCase("Romance")) {
			RomanceBook newBook = new RomanceBook(title, author, subject, bookID, yearPublish, publisher, edition, page,
					genre);
			book = newBook;
		} else if (genre.equalsIgnoreCase("Horror")) {
			HorrorBook newBook = new HorrorBook(title, author, subject, bookID, yearPublish, publisher, edition, page,
					genre);
			book = newBook;
		} else if (genre.equalsIgnoreCase("Comedy")) {
			ComedyBook newBook = new ComedyBook(title, author, subject, bookID, yearPublish, publisher, edition, page,
					genre);
			book = newBook;
		}
		return book;
	}

}
