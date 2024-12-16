package view;

import java.util.ArrayList;

import database.Database;
import factory.BibliographyFactory;
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
import model.bibliography.Bibliography;
import javafx.event.*;
public class InsertBookView extends Application implements EventHandler<ActionEvent>{
	public static Database instance = Database.getInstance();
	public static ArrayList<Bibliography>biData= instance.getInstance().getBiData();
	private Button submit;
	private BorderPane borderPane;
	private Scene scene;
	private TextField bookIDField;
	private TextField yearField;
	private TextField publisherField;
	private TextField editionField;
	private TextField pageField;
	private TextField genreField;
	
	private Label bookIDLabel;
	private Label yearLabel;
	private Label publisherLabel;
	private Label editionLabel;
	private Label pageLabel;
	private Label genreLabel;
	private Author author;
	private String title;
	private String genre;

	

	
	public InsertBookView(Author author,String title, String genre) {
		super();
		// TODO Auto-generated constructor stub
		this.title=title;
		this.genre=genre;
		this.author=author;
	}
	private GridPane gridPane;
	private void setEventHandler() {
		submit.setOnAction(this);
	}
	
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submit) {
			String bookID=bookIDField.getText();
			int yearPublish=Integer.parseInt(yearField.getText());
			String publisher=publisherField.getText();
			String edition=editionField.getText();
			int page=Integer.parseInt(pageField.getText());
          BibliographyFactory bi=new BibliographyFactory(); 
          Bibliography newBi=bi.makeBook(title, author, genre, bookID, yearPublish, publisher, edition, page, genre);

          biData.add(newBi);
          try {
	            HomeView homeView = new HomeView();
	            homeView.start((Stage) submit.getScene().getWindow());
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
		gridPane.add(bookIDLabel, 0, 1);
		gridPane.add(bookIDField, 0, 2);
		gridPane.add(yearLabel, 0, 3);
		gridPane.add(yearField, 0, 4);
		gridPane.add(publisherLabel, 0, 5);
		gridPane.add(publisherField, 0, 6);
		gridPane.add(editionLabel, 0, 7);
		gridPane.add(editionField, 0, 8);
		gridPane.add(pageLabel, 0, 9);
		gridPane.add(pageField, 0, 10);

		gridPane.add(genreLabel, 0, 11);
		gridPane.add(genreField, 0, 12);
		gridPane.add(submit, 0, 13);


		
	}
	public void initialize() {
//		usernameLabel = new Label("Username");
//		emailLabel = new Label("Email");
//		passwordLabel = new Label("Password");
//
//		usernameTF = new TextField();
//		emailTF = new TextField();
//		passwordTF = new PasswordField();

		submit= new Button("Submit");
		bookIDLabel = new Label("Book ID:");
        bookIDField = new TextField();

         yearLabel = new Label("Year of Publication:");
         yearField = new TextField();

         publisherLabel = new Label("Publisher:");
         publisherField = new TextField();

         editionLabel = new Label("Book Edition:");
         editionField = new TextField();

         pageLabel = new Label("Total Page:");
         pageField = new TextField();

         genreLabel = new Label("Genre:");
         genreField = new TextField(); // Tambahkan inisialisasi ini

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
