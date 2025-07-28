// BookTableView.java
package view;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;

import database.Database;
import factory.BookFactory;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import model.author.Author;
import model.bibliography.Bibliography;
import model.book.Book;

public class BookTableView {

    private Node scene; 
    private Button addButton;
    public BookTableView() {
        TableView<Book> tableView = new TableView<>();
        tableView.setItems(getBookList());

        TableColumn<Book, Integer> colNo = new TableColumn<>("NO");
        int nomor=1;
        colNo.setCellValueFactory(cellData -> 
        	new ReadOnlyObjectWrapper<>(tableView.getItems().indexOf(cellData.getValue()) + 1)
        );

        TableColumn<Book, String> colTitle = new TableColumn<>("TITLE");
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Book, String> colAuthor = new TableColumn<>("AUTHOR NAME - DOB - COUNTRY");
        colAuthor.setCellValueFactory(cellData -> {
            Author author = cellData.getValue().getAuthor();
            String info = (author != null) ?
                author.getAuthorName() + " - " + author.getDateOfBirth() + " - " + author.getCountry() :
                "No Author Info";
            return new SimpleStringProperty(info);
        });

        TableColumn<Book, String> colGenre = new TableColumn<>("GENRE");
        colGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));

        TableColumn<Book, String> colBookId = new TableColumn<>("BOOK ID");
        colBookId.setCellValueFactory(new PropertyValueFactory<>("bookID"));

        TableColumn<Book, Integer> colYear = new TableColumn<>("YEAR PUBLISH");
        colYear.setCellValueFactory(new PropertyValueFactory<>("yearPublish"));

        TableColumn<Book, String> colPublisher = new TableColumn<>("PUBLISHER");
        colPublisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));

        TableColumn<Book, String> colEdition = new TableColumn<>("EDITION");
        colEdition.setCellValueFactory(new PropertyValueFactory<>("edition"));

        TableColumn<Book, Void> colAction = new TableColumn<>("ACTION");
        colAction.setCellFactory(param -> new TableCell<Book, Void>() {
            private final Button editBtn = new Button("", new ImageView("https://cdn-icons-png.flaticon.com/16/1159/1159633.png"));
            private final Button deleteBtn = new Button("", new ImageView("https://cdn-icons-png.flaticon.com/16/1214/1214428.png"));
            private final HBox pane = new HBox(5, editBtn, deleteBtn);

            {
                editBtn.setStyle("-fx-background-color: transparent;");
                deleteBtn.setStyle("-fx-background-color: transparent;");
                editBtn.setOnAction(event -> {
                    Book book = getTableView().getItems().get(getIndex());
                    System.out.println("Edit: " + book.getTitle());
                });
                deleteBtn.setOnAction(event -> {
                    Book book = getTableView().getItems().get(getIndex());
                    System.out.println("Delete: " + book.getTitle());
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : pane);
            }
        });

        tableView.getColumns().addAll(colNo, colTitle, colAuthor, colGenre, colBookId, colYear, colPublisher, colEdition, colAction);

        BorderPane layout = new BorderPane(tableView);
        addButton = new Button("+ ADD NEW ARTWORK");
        addButton.setStyle("-fx-background-color: #a93226; -fx-text-fill: white; -fx-font-weight: bold;");

        addButton.setOnAction(e -> {
            // logic untuk menambah artwork, misal buka form baru
        	
            System.out.println("Tambah artwork baru diklik!");
            InsertBookView insertBook=new InsertBookView();
            insertBook.show();
            
        });
        layout.setTop(addButton);
        layout.setPadding(new Insets(10));
        scene = layout;
    }

    public Node getNode() {
        return scene;
    }

    
    private ObservableList<Book> getBookList() {
    	Database instance = Database.getInstance();
    	ArrayList<Book>biData= instance.getInstance().getBookData(); 
    	Author author=new Author("LASER","261204","sEMARANG");
    	Book dataBok=BookFactory.createBook("Avenger",author,"SUBJECT","2828kK",2004,"orang","2",20,"romance");
    	biData.add(dataBok);
        return FXCollections.observableArrayList(biData);
    }
}
