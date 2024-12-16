package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class HomeView extends Application implements EventHandler<ActionEvent>{
	private Button insertButton, updateButton, deleteButton,SearchButton,DisplayAllButton;
	private BorderPane borderPane;
	private Scene scene;
	private GridPane gridPane;
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
		gridPane.add(insertButton, 0, 1);
		gridPane.add(updateButton, 0, 2);
		gridPane.add(deleteButton, 0, 3);
		gridPane.add(SearchButton, 0, 4);
		gridPane.add(DisplayAllButton, 0, 5);
	}
	private void setEventHandler() {
		insertButton.setOnAction(this);
		updateButton.setOnAction(this);
		deleteButton.setOnAction(this);
	}

	public void initialize() {
//		usernameLabel = new Label("Username");
//		emailLabel = new Label("Email");
//		passwordLabel = new Label("Password");
//
//		usernameTF = new TextField();
//		emailTF = new TextField();
//		passwordTF = new PasswordField();

		insertButton = new Button("Insert");
		updateButton = new Button("Update");
		deleteButton = new Button("Delete");
		SearchButton = new Button("Search By Category");
		DisplayAllButton=new Button("Display All");
		
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
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==insertButton) {
			System.out.println("masuk insert");
			 try {
		            InsertView insertView = new InsertView();
		            insertView.start((Stage) insertButton.getScene().getWindow());
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
		
	}
	
	
	
	

}
