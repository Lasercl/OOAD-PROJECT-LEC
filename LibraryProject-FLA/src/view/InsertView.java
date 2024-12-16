package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.author.Author;
import javafx.event.*;
public class InsertView extends Application implements EventHandler<ActionEvent>{
	private Button book,compf,artwork;
	private BorderPane borderPane;
	private Scene scene;
//	private TextField bookIDField;
//	private TextField yearField;
//	private TextField publisherField;
//	private TextField editionField;
//	private TextField pageField;
//	private TextField genreField;
//	
//	private Label bookIDLabel;
//	private Label yearLabel;
//	private Label publisherLabel;
//	private Label editionLabel;
//	private Label pageLabel;
//	private Label genreLabel;
	private Label titleLabel;
	private Label subjectLabel;
	private Label authorName;
	private Label authorBirth;
	private Label authorCountry;

	private TextField titleField;
	private TextField subjectField;
	private TextField authorNameField;
	private TextField authorBirthField;
	private TextField authorCountryField;
	
	
	private GridPane gridPane;
	private void setEventHandler() {
		book.setOnAction(this);
		compf.setOnAction(this);
		artwork.setOnAction(this);
	}
	
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==book) {
			System.out.println("masuk insert book");
			String subject=subjectField.getText();
			String title=titleField.getText();
			String nameAuthor=authorNameField.getText();
			String birthAuthor=authorBirthField.getText();
			String countryAuthor=authorCountryField.getText();
			Author newAuthor=new Author(nameAuthor, birthAuthor, countryAuthor);
			 try {
		            InsertBookView insertBookView = new InsertBookView(newAuthor,title,subject);
		            insertBookView.start((Stage) book.getScene().getWindow());
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		initialize();
		layout();
		setEventHandler();

//		refreshTable();

		primaryStage.setWidth(1000);
		primaryStage.setHeight(600);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void layout() {
		gridPane.add(titleLabel, 0, 1);
		gridPane.add(titleField, 0, 2);
		gridPane.add(subjectLabel, 0, 3);
		gridPane.add(subjectField, 0, 4);
		gridPane.add(authorName, 0, 5);
		gridPane.add(authorNameField, 0, 6);
		gridPane.add(authorBirth, 0, 7);
		gridPane.add(authorBirthField, 0, 8);
		gridPane.add(authorCountry, 0, 9);
		gridPane.add(authorCountryField, 0, 10);
		
		gridPane.add(book, 1,2);
		gridPane.add(compf, 1, 3);
		gridPane.add(artwork, 1, 4);
		
	}
	public void initialize() {
//		usernameLabel = new Label("Username");
//		emailLabel = new Label("Email");
//		passwordLabel = new Label("Password");
//
//		usernameTF = new TextField();
//		emailTF = new TextField();
//		passwordTF = new PasswordField();
		 // Inisialisasi Label
	    titleLabel = new Label("Title:");
	    subjectLabel = new Label("Subject:");
	    authorName = new Label("Author Name:");
	    authorBirth = new Label("Author Birth:");
	    authorCountry = new Label("Author Country:");

	    // Inisialisasi TextField
	    titleField = new TextField();
	    subjectField = new TextField();
	    authorNameField = new TextField();
	    authorBirthField = new TextField();
	    authorCountryField = new TextField();
	    
		book = new Button("Add New Book");
		compf = new Button("Add New Computer File");
		artwork = new Button("Add New ArtWork");
//		bookIDLabel = new Label("Book ID:");
//        bookIDField = new TextField();
//
//         yearLabel = new Label("Year of Publication:");
//         yearField = new TextField();
//
//         publisherLabel = new Label("Publisher:");
//         publisherField = new TextField();
//
//         editionLabel = new Label("Book Edition:");
//         editionField = new TextField();
//
//         pageLabel = new Label("Total Page:");
//         pageField = new TextField();
//
//         genreLabel = new Label("Genre:");
		
		borderPane = new BorderPane();
		scene = new Scene(borderPane);

		gridPane = new GridPane();
		borderPane.setCenter(gridPane);
		
		//		userTable = new TableView<>();
//		userList = new ArrayList<>();
//
//		IDColumn = new TableColumn<>("ID");
//		UsernameColumn = new TableColumn<>("Username");
//		EmailColumn = new TableColumn<>("Email");
	}

}
