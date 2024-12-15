package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import database.Database;
import factory.BibliographyFactory;
import factory.BookFactory;
import factory.ComputerFileFactory;
import model.artwork.Artwork;
import model.author.Author;
import model.bibliography.Bibliography;
import model.book.Book;
import model.computerfile.ComputerFile;

public class Main {

		public static Database instance = Database.getInstance();
		public static ArrayList<Bibliography>biData= instance.getInstance().getBiData();
		public static void displayAll() {
			displayBook();
			displayCompf();
			displayArtwork();
		}
		public static void displayArtwork() {
			String spaces = " ";
            System.out.println("Artwork Data : ");
            System.out.println(
                            "==============================================================="
                                            +
                                            "=======================================================================================");

            System.out.printf("|" + spaces.repeat(2) + "%s" +
                            spaces.repeat(2) + "|"
                            + spaces.repeat(7) + "%s" +
                            spaces.repeat(7) + "|"
                            + spaces.repeat(10) + "%s" +
                            spaces.repeat(10) + "|"
                            + spaces.repeat(3) + "%s" +
                            spaces.repeat(3) + "|"
                            + spaces.repeat(1) + "%s" +
                            spaces.repeat(1) + "|"
                            + spaces.repeat(4) + "%s" +
                            spaces.repeat(4) + "|"
                            + spaces.repeat(4) + "%s" +
                            spaces.repeat(4) + "|"
                            + spaces.repeat(4) + "%s" +
                            spaces.repeat(4) + "|\n", "No", "Title",
                            "Author Name",
                            "Genre", "Year of Publication",
                            "Art Type", "Art Style",
                            "Art Movement");

            System.out.println(
                            "==============================================================="
                                            +
                                            "=======================================================================================");
            for (int i = 0; i < biData.size(); i++) {
            	if(biData.get(i) instanceof Artwork) {
                    System.out.printf("|%-6s|%-19s|", i + 1,
                                    biData.get(i).getTitle());
                    System.out.printf(
                                    "%-31s" + "-" + "%-15s" + "-"
                                                    + "%-15s",
                                    biData.get(i).getAuthor()
                                                    .getAuthorName(),
                                    biData.get(i).getAuthor()
                                                    .getDateOfBirth(),
                                    biData.get(i).getAuthor()
                                                    .getCountry());
                    Artwork art=(Artwork) biData.get(i);
                    System.out.printf(
                                    "|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                    biData.get(i).getGenre(),
                                    art.getYear(),
                                    art.getArtType(),
                                    art.getArtStyle(),
                                    art.getArtMovement());
            	}
            }

            for (int i = 0; i < 2; i++) {
                    System.out.println();
            }

		}
		public static void displayCompf() {
			   System.out.println("Computer File Data : ");
			   String spaces = " ";

			   System.out.println(
                       "================================================================================="
                                       +
                                       "======================================================================================");

               System.out.printf("|" + spaces.repeat(2) + "%s" +
                               spaces.repeat(2) + "|"
                               + spaces.repeat(7) + "%s" +
                               spaces.repeat(7) + "|"
                               + spaces.repeat(10) + "%s" +
                               spaces.repeat(10) + "-"
                               + spaces.repeat(1) + "%s" +
                               spaces.repeat(1) + "-"
                               + spaces.repeat(4) + "%s" +
                               spaces.repeat(4) + "|"
                               + spaces.repeat(3) + "%s" +
                               spaces.repeat(3) + "|"
                               + spaces.repeat(2) + "%s" +
                               spaces.repeat(2) + "|"
                               + spaces.repeat(2) + "%s" +
                               spaces.repeat(2) + "|"
                               + spaces.repeat(1) + "%s" +
                               spaces.repeat(1) + "|\n", "No", "Title",
                               "Author Name", "Date of Birth",
                               "Country",
                               "Genre", "File Format (uplouded)", "Date Created",
                               "File Size (pdf)");

               System.out.println(
                               "================================================================================="
                                               +
                                               "======================================================================================");

               for (int i = 0; i < biData.size(); i++) {
               	if(biData.get(i) instanceof ComputerFile) {
                       System.out.printf("|%-6s|%-19s|", i + 1,
                                       biData.get(i).getTitle());
                       System.out.printf(
                                       "%-31s" + "-" + "%-15s" + "-"
                                                       + "%-15s",
                                       biData.get(i).getAuthor()
                                                       .getAuthorName(),
                                       biData.get(i).getAuthor()
                                                       .getDateOfBirth(),
                                       biData.get(i).getAuthor()
                                                       .getCountry());
                       ComputerFile compf1=(ComputerFile) biData.get(i);
                       System.out.printf("|%-11s|%-26s|%-16s|%-17s|\n",
                                       biData.get(i).getGenre(),
                                       compf1.getFormat(),
                                       compf1.getDateCreated(),
                                       compf1.getFileSize());
               	}
               }

               for (int i = 0; i < 2; i++) {
                       System.out.println();
               }


		}
		public static void displayBook() {
			System.out.println("Book Data : ");
            String spaces = " ";

            System.out.println(
                            "==============================================================="
                                            +
                                            "============================================================================"
                                            +
                                            "========================");

            System.out.printf("|" + spaces.repeat(2) + "%s" +
                            spaces.repeat(2) + "|"
                            + spaces.repeat(7) + "%s" +
                            spaces.repeat(7) + "|"
                            + spaces.repeat(10) + "%s" +
                            spaces.repeat(10) + "-"
                            + spaces.repeat(1) + "%s" +
                            spaces.repeat(1) + "-"
                            + spaces.repeat(4) + "%s" +
                            spaces.repeat(4) + "|"
                            + spaces.repeat(3) + "%s" +
                            spaces.repeat(3) + "|"
                            + spaces.repeat(2) + "%s" +
                            spaces.repeat(2) + "|"
                            + spaces.repeat(2) + "%s" +
                            spaces.repeat(2) + "|"
                            + spaces.repeat(3) + "%s" +
                            spaces.repeat(3) + "|"
                            + spaces.repeat(3) + "%s" +
                            spaces.repeat(3) + "|\n", "No", "Title",
                            "Author Name",
                            "Date of Birth", "Country",
                            "Genre", "Book ID", "Year Publish",
                            "Publisher",
                            "Edition", "Page");

            System.out.println(
                            "==============================================================="
                                            +
                                            "==========================================================================="
                                            +
                                            "=========================");
            for (int i = 0; i < biData.size(); i++) {
            	if(biData.get(i) instanceof Book) {
            		
            	
                    System.out.printf("|%-6s|%-19s|", i + 1,
                                    biData.get(i).getTitle());
                    System.out.printf(
                                    "%-31s" + "-" + "%-15s" + "-"
                                                    + "%-15s",
                                    biData.get(i).getAuthor()
                                                    .getAuthorName(),
                                    biData.get(i).getAuthor()
                                                    .getDateOfBirth(),
                                    biData.get(i).getAuthor()
                                                    .getCountry());
                    Book book= (Book) biData.get(i);

                    System.out.printf(
                                    "|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                    biData.get(i).getGenre(),
                                    book.getBookID(),
                                    book.getYearPublish(),
                                    book.getPublisher(),
                                    book.getEdition(),
                                    book.getPage());
            	}
            }

            for (int i = 0; i < 2; i++) {
                    System.out.println();
            }

		}
        public Main() {
        		
        		BookFactory BF = new BookFactory();
        		ComputerFileFactory CFF = new ComputerFileFactory();
        		boolean flag=false;
                Scanner scanner = new Scanner(System.in);

//                ArrayList<Book> bookData = new ArrayList<>();
//                ArrayList<ComputerFile> compData = new ArrayList<>();
//                ArrayList<Artwork> artData = new ArrayList<>();
//                ArrayList<Author> authorData = new ArrayList<>();
//                
                int input, input2, input3, input4, input5;

                do {
                        System.out.println("1. Add New Bibliography");
                        System.out.println("2. Remove Bibliography");
                        System.out.println("3. Update Bibliography");
                        System.out.println("4. Search Bibliography");
                        System.out.println("5. Display All Bibliography");
                        System.out.println("6. Exit");

                        System.out.print("Your choice : ");
                        input = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println();
                        System.out.println();

                        switch (input) {
                                case 1:
                                        System.out.println("Title and Subject");
                                        System.out.print("Insert Title : ");
                                        String title = scanner.nextLine();

                                        System.out.print("Insert Subject : ");
                                        String subject = scanner.nextLine();

                                        System.out.println();

                                        System.out.println("Author Data");
                                        System.out.print("Insert Author Name : ");
                                        String authorName = scanner.nextLine();

                                        System.out.print("Insert Author Date of Birth (dd/mm/yy) : ");
                                        String dob = scanner.nextLine();

                                        System.out.print("Insert Author Country : ");
                                        String country = scanner.nextLine();

                                        System.out.println();
                                        System.out.println();

                                        System.out.println("1. Add New Book");
                                        System.out.println("2. Add New Computer File");
                                        System.out.println("3. Add New Artwork");
                                        System.out.println("4. Back ");

                                        do {
                                                System.out.print("Insert Type of Bibliography : ");
                                                input2 = scanner.nextInt();
                                                scanner.nextLine();
                                        } while (input2 != 1 && input2 != 2 && input2 != 3 && input2 != 4);

                                        System.out.println();
                                        System.out.println();

                                        switch (input2) {
                                                case 1:
                                                        System.out.print("Insert Book ID : ");
                                                        String bookID = scanner.nextLine();

                                                        System.out.print("Insert Year of Publication : ");
                                                        int yearPublish = scanner.nextInt();
                                                        scanner.nextLine();

                                                        System.out.print("Insert Publisher : ");
                                                        String publisher = scanner.nextLine();

                                                        System.out.print("Insert Book Edition : ");
                                                        String edition = scanner.nextLine();

                                                        System.out.print("Insert Total Page : ");
                                                        int page = scanner.nextInt();
                                                        scanner.nextLine();
                                                        
                                                        System.out.println("Insert Genre [Romance / Horror / Comedy]:");
                                                        String genre = scanner.nextLine();

                                                        Author insertAuthor = new Author(authorName, dob, country);
//                                                        Book insertBook = new Book(title, insertAuthor, subject, bookID,
//                                                                        yearPublish, publisher, edition, page);
                                                        
//                                                        Book insertBook = BF.createBook(title, insertAuthor, subject, bookID, yearPublish, publisher, edition, page, genre);
                                                        BibliographyFactory bi=new BibliographyFactory(); 
                                                        Bibliography newBi=bi.makeBook(title, insertAuthor, subject, bookID, yearPublish, publisher, edition, page, genre);
//                                                        bookData.add(insertBook);
//                                                        authorData.add(insertAuthor);
                                                        biData.add(newBi);
                                                        input2 = 4;

                                                        System.out.println();
                                                        System.out.println();

                                                        break;

                                                case 2:
                                                        System.out.print("Insert Date Modified : ");
                                                        String dateCreated = scanner.nextLine();

                                                        System.out.print("Insert File Format [Word/Pdf]: ");
                                                        String format = scanner.nextLine();

                                                        System.out.print("Insert File Size : ");
                                                        double fileSize = scanner.nextDouble();
                                                        scanner.nextLine();

                                                        insertAuthor = new Author(authorName, dob, country);
//                                                        ComputerFile insertComp = new ComputerFile(title, insertAuthor,
//                                                                        subject, dateCreated, format, fileSize);
                                                        
//                                                        ComputerFile insertComp = null;
                                                        
//                                                        if(format.equalsIgnoreCase("word")) {
//                                                        	insertComp = CFF.createCfPdf(title, insertAuthor, subject, dateCreated, format, fileSize);
//                                                        }
//                                                        else if(format.equalsIgnoreCase("pdf")) {
//                                                        	insertComp = CFF.createCfWord(title, insertAuthor, subject, dateCreated, format, fileSize);
//                                                        }
                                                        BibliographyFactory biCompf=new BibliographyFactory();
                                                        Bibliography newCompf=biCompf.makeComputerFile(title, insertAuthor, subject, dateCreated, format, fileSize);
                                                        biData.add(newCompf);

                                                        input2 = 4;

                                                        System.out.println();
                                                        System.out.println();

                                                        break;

                                                case 3:
                                                        System.out.print("Insert Year Created : ");
                                                        int year = scanner.nextInt();
                                                        scanner.nextLine();

                                                        System.out.print("Insert Type of Art : ");
                                                        String artType = scanner.nextLine();

                                                        System.out.print("Insert Art Style : ");
                                                        String artStyle = scanner.nextLine();

                                                        System.out.print("Insert Art Movement : ");
                                                        String artMovement = scanner.nextLine();

                                                        insertAuthor = new Author(authorName, dob, country);
//                                                        Artwork insertArt = new Artwork(title, insertAuthor, subject,
//                                                                        year, artType, artStyle,
//                                                                        artMovement);
//
//                                                        artData.add(insertArt);
//                                                        authorData.add(insertAuthor);
                                                        BibliographyFactory biArtwork=new BibliographyFactory();
                                                        Bibliography newArtwork=biArtwork.makeArtwork(title, insertAuthor, subject, year, artType, artStyle, artMovement);
                                                        biData.add(newArtwork);

                                                        input2 = 4;

                                                        System.out.println();
                                                        System.out.println();

                                                        break;

                                                case 4:
                                                        break;
                                        }

                                        break;

                                case 2:
                                        do {
                                                System.out.print(
                                                                "1. Delete Book\n2. Delete Computer File\n3. Delete Artwork\n4. Back\n"
                                                                                +
                                                                                "Select Delete : ");
                                                input5 = scanner.nextInt();
                                                scanner.nextLine();

                                                System.out.println();
                                                System.out.println();

                                                switch (input5) {
                                                        case 1:
                                                        		for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof Book) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
                                                                if (biData.isEmpty()||flag==false) {
                                                                        System.out.println("No data\n");
                                                                        continue;
                                                                }

                                                                System.out.println("Book Data : ");
                                                                String spaces = " ";

                                                                System.out.println(
                                                                                "==============================================================="
                                                                                                +
                                                                                                "============================================================================"
                                                                                                +
                                                                                                "========================");

                                                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(7) + "%s" +
                                                                                spaces.repeat(7) + "|"
                                                                                + spaces.repeat(10) + "%s" +
                                                                                spaces.repeat(10) + "-"
                                                                                + spaces.repeat(1) + "%s" +
                                                                                spaces.repeat(1) + "-"
                                                                                + spaces.repeat(4) + "%s" +
                                                                                spaces.repeat(4) + "|"
                                                                                + spaces.repeat(3) + "%s" +
                                                                                spaces.repeat(3) + "|"
                                                                                + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(3) + "%s" +
                                                                                spaces.repeat(3) + "|"
                                                                                + spaces.repeat(3) + "%s" +
                                                                                spaces.repeat(3) + "|\n", "No", "Title",
                                                                                "Author Name",
                                                                                "Date of Birth", "Country",
                                                                                "Genre", "Book ID", "Year Publish",
                                                                                "Publisher",
                                                                                "Edition", "Page");

                                                                System.out.println(
                                                                                "==============================================================="
                                                                                                +
                                                                                                "==========================================================================="
                                                                                                +
                                                                                                "=========================");
                                                                for (int i = 0; i < biData.size(); i++) {
                                                                	if(biData.get(i) instanceof Book) {
                                                                		
                                                                	
                                                                        System.out.printf("|%-6s|%-19s|", i + 1,
                                                                                        biData.get(i).getTitle());
                                                                        System.out.printf(
                                                                                        "%-31s" + "-" + "%-15s" + "-"
                                                                                                        + "%-15s",
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getAuthorName(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getDateOfBirth(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getCountry());
                                                                        Book book= (Book) biData.get(i);
            
                                                                        System.out.printf(
                                                                                        "|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                                                                        biData.get(i).getGenre(),
                                                                                        book.getBookID(),
                                                                                        book.getYearPublish(),
                                                                                        book.getPublisher(),
                                                                                        book.getEdition(),
                                                                                        book.getPage());
                                                                	}
                                                                }

                                                                for (int i = 0; i < 2; i++) {
                                                                        System.out.println();
                                                                }

                                                                System.out.print("Select Book Data to Delete : ");
                                                                int del1 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (del1 > 0 && del1 <= biData.size()) {
                                                                        biData.remove(del1 - 1);
                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;

                                                        case 2:
	                                                        	for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof ComputerFile) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
	                                                            if (biData.isEmpty()||flag==false) {
	                                                                    System.out.println("No data\n");
	                                                                    continue;
	                                                            }
//                                                                if (compData.isEmpty()) {
//                                                                        System.out.println("No data\n");
//                                                                        continue;
//                                                                }

                                                                System.out.println("Computer File Data : ");
                                                                spaces = " ";

                                                                System.out.println(
                                                                        "================================================================================="
                                                                                        +
                                                                                        "======================================================================================");
                                                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(7) + "%s" +
                                                                                spaces.repeat(7) + "|"
                                                                                + spaces.repeat(10) + "%s" +
                                                                                spaces.repeat(10) + "-"
                                                                                + spaces.repeat(1) + "%s" +
                                                                                spaces.repeat(1) + "-"
                                                                                + spaces.repeat(4) + "%s" +
                                                                                spaces.repeat(4) + "|"
                                                                                + spaces.repeat(3) + "%s" +
                                                                                spaces.repeat(3) + "|"
                                                                                + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(1) + "%s" +
                                                                                spaces.repeat(1) + "|\n", "No", "Title",
                                                                                "Author Name", "Date of Birth",
                                                                                "Country",
                                                                                "Genre","File Format (uplouded)", "Date Created",
                                                                                "File Size (pdf)");


                                                                System.out.println(
                                                                                "================================================================================="
                                                                                                +
                                                                                                "======================================================================================");
                                                                for (int i = 0; i < biData.size(); i++) {
                                                                	if(biData.get(i) instanceof ComputerFile) {
                                                                        System.out.printf("|%-6s|%-19s|", i + 1,
                                                                                        biData.get(i).getTitle());
                                                                        System.out.printf(
                                                                                        "%-31s" + "-" + "%-15s" + "-"
                                                                                                        + "%-15s",
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getAuthorName(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getDateOfBirth(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getCountry());
                                                                        ComputerFile compf1=(ComputerFile) biData.get(i);
                                                                        System.out.printf("|%-11s|%-26s|%-16s|%-17s|\n",
                                                                                        biData.get(i).getGenre(),
                                                                                        compf1.getFormat(),
                                                                                        compf1.getDateCreated(),
                                                                                        compf1.getFileSize());
                                                                	}
                                                                }

                                                                for (int i = 0; i < 2; i++) {
                                                                        System.out.println();
                                                                }

                                                                System.out.print(
                                                                                "Select Computer File Data to Delete : ");
                                                                int del2 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (del2 > 0 && del2 <= biData.size()) {
                                                                        biData.remove(del2 - 1);
                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;

                                                        case 3:
	                                                        	for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof Artwork) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
	                                                            if (biData.isEmpty()||flag==false) {
	                                                                    System.out.println("No data\n");
	                                                                    continue;
	                                                            }
                                                                
                                                                spaces = " ";
                                                                System.out.println("Artwork Data : ");
                                                                System.out.println(
                                                                                "==============================================================="
                                                                                                +
                                                                                                "=======================================================================================");

                                                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                                                spaces.repeat(2) + "|"
                                                                                + spaces.repeat(7) + "%s" +
                                                                                spaces.repeat(7) + "|"
                                                                                + spaces.repeat(10) + "%s" +
                                                                                spaces.repeat(10) + "|"
                                                                                + spaces.repeat(3) + "%s" +
                                                                                spaces.repeat(3) + "|"
                                                                                + spaces.repeat(1) + "%s" +
                                                                                spaces.repeat(1) + "|"
                                                                                + spaces.repeat(4) + "%s" +
                                                                                spaces.repeat(4) + "|"
                                                                                + spaces.repeat(4) + "%s" +
                                                                                spaces.repeat(4) + "|"
                                                                                + spaces.repeat(4) + "%s" +
                                                                                spaces.repeat(4) + "|\n", "No", "Title",
                                                                                "Author Name",
                                                                                "Genre", "Year of Publication",
                                                                                "Art Type", "Art Style",
                                                                                "Art Movement");

                                                                System.out.println(
                                                                                "==============================================================="
                                                                                                +
                                                                                                "=======================================================================================");
                                                                for (int i = 0; i < biData.size(); i++) {
                                                                	if(biData.get(i) instanceof Artwork) {
                                                                        System.out.printf("|%-6s|%-19s|", i + 1,
                                                                                        biData.get(i).getTitle());
                                                                        System.out.printf(
                                                                                        "%-31s" + "-" + "%-15s" + "-"
                                                                                                        + "%-15s",
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getAuthorName(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getDateOfBirth(),
                                                                                        biData.get(i).getAuthor()
                                                                                                        .getCountry());
                                                                        Artwork art=(Artwork) biData.get(i);
                                                                        System.out.printf(
                                                                                        "|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                                                                        biData.get(i).getGenre(),
                                                                                        art.getYear(),
                                                                                        art.getArtType(),
                                                                                        art.getArtStyle(),
                                                                                        art.getArtMovement());
                                                                	}
                                                                }

                                                                for (int i = 0; i < 2; i++) {
                                                                        System.out.println();
                                                                }

                                                                System.out.print("Select Art Work Data to Delete : ");
                                                                int del3 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (del3 > 0 && del3 <= biData.size()) {
                                                                        biData.remove(del3 - 1);
                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;
                                                }

                                        } while (input5 != 4);

                                        break;

                                case 3:
                                        do {
                                                System.out.print(
                                                                "1. Update Book\n2. Update Computer File\n3. Update Artwork\n4. Back\n"
                                                                                +
                                                                                "Select Update : ");
                                                input3 = scanner.nextInt();
                                                scanner.nextLine();

                                                System.out.println();
                                                System.out.println();

                                                switch (input3) {
                                                        case 1:
	                                                        	for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof Book) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
	                                                            if (biData.isEmpty()||flag==false) {
	                                                                    System.out.println("No data\n");
	                                                                    continue;
	                                                            }

//                                                                System.out.println("Book Data : ");
                                                                displayBook();

                                                                System.out.print("Select Book Data to Update: ");
                                                                int up1 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (up1 > 0 && up1 <= biData.size()) {
                                                                        System.out.println();
                                                                        System.out.println("Book Data : ");

                                                                        System.out.print("1. Insert Title : ");
                                                                        title = scanner.nextLine();

                                                                        System.out.print("2. Insert Subject : ");
                                                                        subject = scanner.nextLine();

                                                                        System.out.print("3. Insert Book ID : ");
                                                                        String bookID = scanner.nextLine();

                                                                        System.out.print(
                                                                                        "4. Insert Year of Publication : ");
                                                                        int yearPublish = scanner.nextInt();
                                                                        scanner.nextLine();

                                                                        System.out.print("5. Insert Publisher : ");
                                                                        String publisher = scanner.nextLine();

                                                                        System.out.print("6. Insert Book Edition : ");
                                                                        String edition = scanner.nextLine();

                                                                        System.out.print("7. Insert Page : ");
                                                                        int page = scanner.nextInt();

                                                                        System.out.println();
                                                                        System.out.println("Author Data : ");
                                                                        System.out.print("1. Insert Author Name : ");
                                                                        authorName = scanner.nextLine();

                                                                        System.out.print("2. Insert Date Of Birth : ");
                                                                        dob = scanner.nextLine();

                                                                        System.out.print("3. Insert Country : ");
                                                                        country = scanner.nextLine();

                                                                        int authorIndex = 0;
                                                                        Author updateAuthor = new Author(authorName, dob, country);
                                                                        BibliographyFactory upBi=new BibliographyFactory();
                                                                        Bibliography updateBi=upBi.makeBook(title, updateAuthor, subject, bookID, yearPublish, publisher, edition, page, edition);
                                                                        biData.set(up1-1, updateBi);
                                                                        
                                                                        
//                                                                        for (int i = 0; i < authorData.size(); i++) {
//                                                                                if (bookData.get(up1 - 1)
//                                                                                                .getAuthor() == authorData
//                                                                                                                .get(i)) {
//                                                                                        authorIndex = i;
//                                                                                }
//                                                                        }
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(authorName);
//                                                                        authorData.get(authorIndex).setAuthorName(dob);
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(country);
//
//                                                                        String currentGenre = bookData.get(up1 - 1).getGenre(); // Assuming `getGenre()` exists
//                                                                        
//                                                                        Book updateBook = BF.createBook(title, authorData.get(authorIndex), subject, bookID, yearPublish, publisher, edition, page, currentGenre);
//                                                                        bookData.set(up1 - 1, updateBook);

                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;

                                                        case 2:
	                                                        	for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof ComputerFile) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
	                                                            if (biData.isEmpty()||flag==false) {
	                                                                    System.out.println("No data\n");
	                                                                    continue;
	                                                            }

                                                               displayCompf();

                                                                System.out.print(
                                                                                "Select Computer File Data to Update : ");
                                                                int up2 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (up2 > 0 && up2 <= biData.size()) {
                                                                        System.out.println();
                                                                        System.out.println("Computer File Data : ");

                                                                        System.out.print("1. Insert Title : ");
                                                                        title = scanner.nextLine();

                                                                        System.out.print("2. Insert Subject : ");
                                                                        subject = scanner.nextLine();

                                                                        System.out.print("3. Insert Date Created : ");
                                                                        String dateCreated = scanner.nextLine();

                                                                        System.out.print("4. Insert File Format : ");
                                                                        String format = scanner.nextLine();

                                                                        System.out.print("5. Insert File Size : ");
                                                                        double fileSize = scanner.nextDouble();
                                                                        scanner.nextLine();

                                                                        System.out.println();
                                                                        System.out.println("Author Data : ");
                                                                        System.out.print("1. Insert Author Name : ");
                                                                        authorName = scanner.nextLine();

                                                                        System.out.print("2. Insert Date Of Birth : ");
                                                                        dob = scanner.nextLine();

                                                                        System.out.print("3. Insert Country : ");
                                                                        country = scanner.nextLine();

                                                                        int authorIndex = 0;
                                                                        Author updateAuthor = new Author(authorName, dob, country);
                                                                        BibliographyFactory upBi=new BibliographyFactory();
                                                                        Bibliography updateBi=upBi.makeComputerFile(title, updateAuthor, subject, dateCreated, format, fileSize);
                                                                        biData.set(up2-1, updateBi);
//                                                                        for (int i = 0; i < authorData.size(); i++) {
//                                                                                if (compData.get(up2 - 1)
//                                                                                                .getAuthor() == authorData
//                                                                                                                .get(i)) {
//                                                                                        authorIndex = i;
//                                                                                }
//                                                                        }
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(authorName);
//                                                                        authorData.get(authorIndex).setAuthorName(dob);
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(country);
//
//                                                                        ComputerFile updateComp = new ComputerFile(
//                                                                                        title,
//                                                                                        authorData.get(authorIndex),
//                                                                                        subject, dateCreated, format,
//                                                                                        fileSize);
//                                                                        compData.set(up2 - 1, updateComp);

                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;

                                                        case 3:
	                                                        	for (int i = 0; i < biData.size(); i++) {
																	if(biData.get(i) instanceof Artwork) {
																		flag=true;
																		break;
																	}else {
																		flag=false;
																	}
																}
	                                                            if (biData.isEmpty()||flag==false) {
	                                                                    System.out.println("No data\n");
	                                                                    continue;
	                                                            }

                                                                displayArtwork();
                                                                System.out.print("Select Art Work Data to Update : ");
                                                                int up3 = scanner.nextInt();
                                                                scanner.nextLine();

                                                                if (up3 > 0 && up3 <= biData.size()) {
                                                                        System.out.println();
                                                                        System.out.println("Art Work Data : ");

                                                                        System.out.print("1. Insert Title : ");
                                                                        title = scanner.nextLine();

                                                                        System.out.print("2. Insert Subject : ");
                                                                        subject = scanner.nextLine();

                                                                        System.out.print("3. Insert Year Created : ");
                                                                        int year = scanner.nextInt();
                                                                        scanner.nextLine();

                                                                        System.out.print("4. Insert Type of Art : ");
                                                                        String artType = scanner.nextLine();

                                                                        System.out.print("5. Insert Art Style : ");
                                                                        String artStyle = scanner.nextLine();

                                                                        System.out.print("6. Insert Art Movement : ");
                                                                        String artMovement = scanner.nextLine();

                                                                        System.out.println();
                                                                        System.out.println("Author Data : ");
                                                                        System.out.print("1. Insert Author Name : ");
                                                                        authorName = scanner.nextLine();

                                                                        System.out.print("2. Insert Date Of Birth : ");
                                                                        dob = scanner.nextLine();

                                                                        System.out.print("3. Insert Country : ");
                                                                        country = scanner.nextLine();

                                                                        int authorIndex = 0;
                                                                        Author updateAuthor = new Author(authorName, dob, country);
                                                                        BibliographyFactory upBi=new BibliographyFactory();
                                                                        Bibliography updateBi=upBi.makeArtwork(title, updateAuthor, subject, year, artType, artStyle, artMovement);
                                                                        biData.set(up3-1, updateBi);
//                                                                        for (int i = 0; i < biData.size(); i++) {
//                                                                                if (artData.get(up3 - 1)
//                                                                                                .getAuthor() == authorData
//                                                                                                                .get(i)) {
//                                                                                        authorIndex = i;
//                                                                                }
//                                                                        }
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(authorName);
//                                                                        authorData.get(authorIndex).setAuthorName(dob);
//                                                                        authorData.get(authorIndex)
//                                                                                        .setAuthorName(country);
//
//                                                                        Artwork updateArt = new Artwork(title,
//                                                                                        authorData.get(authorIndex),
//                                                                                        subject, year, artType,
//                                                                                        artStyle, artMovement);
//                                                                        artData.set(up3 - 1, updateArt);

                                                                        input5 = 4;
                                                                } else {
                                                                        System.out.println(
                                                                                        "Your choice don't exist in data.\n");
                                                                        input5 = 4;
                                                                }

                                                                break;
                                                }
                                        } while (input3 != 4);

                                case 4:
                                        do {
                                                System.out.print(
                                                                "1. Search by Book Category\n2. Search by Computer File Category\n3. Search by Artwork Category\n"
                                                                                +
                                                                                "4. Back\nSelect View : ");
                                                input4 = scanner.nextInt();
                                                scanner.nextLine();

                                                for (int i = 0; i < 2; i++) {
                                                        System.out.println();
                                                }

                                                switch (input4) {
                                                        case 1:
                                                        		
                                                                displayBook();
                                                                input4=5;
                                                                break;

                                                        case 2:
                                                                displayCompf();
                                                                input4=5;
                                                                break;

                                                        case 3:
                                                               displayArtwork();
                                                               input4=5;

                                                                break;

                                                        case 4:
                                                                break;
                                                }
                                        } while (input4 != 4);

                                case 5:
                                       displayAll();
                                       input4=5;
                                        break;

                        }
                } while (input != 6);

        }

        public static void main(String[] args) {
                new Main();

        }

}