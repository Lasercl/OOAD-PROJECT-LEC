package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class HomeView extends Application implements EventHandler<ActionEvent>{
	private Button book,computerFile, artwork;
	private BorderPane borderPane;
	private Scene scene;
	private GridPane gridPane;
	private Label library;
    private BorderPane root;
    private VBox sidebar;
    private StackPane contentPane;
    private Label title;
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
		gridPane.add(book, 0, 1);
		gridPane.add(computerFile, 0, 2);
		gridPane.add(artwork, 0, 3);
		//TITLE FONT
		title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        title.setTextFill(Color.WHITE);
        title.setStyle("-fx-background-color: #8B5A2A");
        //BAGIAN KIRI
        sidebar.setPadding(new Insets(30));
        sidebar.setPrefWidth(200);
        sidebar.setStyle("-fx-background-color: #8B5A2B;"); // Warna sidebar coklat
        
        sidebar.getChildren().addAll(title, book, computerFile, artwork);
        sidebar.setPrefWidth(250);
        //nambah bagian kiri
        root.setLeft(sidebar);
	}
	private void setEventHandler() {
		book.setOnAction(this);
		computerFile.setOnAction(this);
		artwork.setOnAction(this);
	}

	public void initialize() {
//		usernameLabel = new Label("Username");
//		emailLabel = new Label("Email");
//		passwordLabel = new Label("Password");
//
//		usernameTF = new TextField();
//		emailTF = new TextField();
//		passwordTF = new PasswordField();
		contentPane=new StackPane();
        root = new BorderPane();
        sidebar = new VBox(20);
        title=new Label("LIBRARY MANAGEMENT");
		library=new Label("WELCOM");
		book = new Button("Book");
		computerFile = new Button("Computer File");
//		deleteButton = new Button("Delete");
		artwork = new Button("Artwork");
//		DisplayAllButton=new Button("Display All");
		
		borderPane = new BorderPane();
		scene = new Scene(root,1000,600);

		gridPane = new GridPane();
		borderPane.setCenter(gridPane);
		
		//		userTable = new TableView<>();
//		userList = new ArrayList<>();
//
//		IDColumn = new TableColumn<>("ID");
//		UsernameColumn = new TableColumn<>("Username");
//		EmailColumn = new TableColumn<>("Email");
	}
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==book) {
			System.out.println("masuk insert");
			
		}
		
	}
	
	
	
	

}
