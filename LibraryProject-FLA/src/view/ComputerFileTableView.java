package view;
import java.util.ArrayList;

import database.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.book.Book;
import model.computerfile.ComputerFile;

public class ComputerFileTableView {
    private TableView<ComputerFile> tableView;
    private Node node;
    public ComputerFileTableView() {
        tableView = new TableView<>();
        createTableColumns();
        tableView.setItems(getDummyData());
        
    }

    private void createTableColumns() {
        TableColumn<ComputerFile, Integer> noCol = new TableColumn<>("NO");
        noCol.setCellValueFactory(new PropertyValueFactory<>("no"));
        noCol.setPrefWidth(50);

        TableColumn<ComputerFile, String> titleCol = new TableColumn<>("TITLE");
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<ComputerFile, String> authorCol = new TableColumn<>("AUTHOR NAME - DOB - COUNTRY");
        authorCol.setCellValueFactory(new PropertyValueFactory<>("authorDetails"));

        TableColumn<ComputerFile, String> genreCol = new TableColumn<>("GENRE");
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));

        TableColumn<ComputerFile, String> formatCol = new TableColumn<>("FILE FORMAT (UPLOADED)");
        formatCol.setCellValueFactory(new PropertyValueFactory<>("fileFormat"));

        TableColumn<ComputerFile, String> dateCol = new TableColumn<>("DATE CREATED");
        dateCol.setCellValueFactory(new PropertyValueFactory<>("dateCreated"));

        TableColumn<ComputerFile, Integer> sizeCol = new TableColumn<>("FILE SIZE (PDF) KB");
        sizeCol.setCellValueFactory(new PropertyValueFactory<>("fileSizeKB"));

        TableColumn<ComputerFile, Void> actionCol = new TableColumn<>("ACTION");
        actionCol.setCellFactory(param -> new TableCell<ComputerFile, Void>() {
            private final Button editBtn = new Button();
            private final Button deleteBtn = new Button();

            {
                ImageView editIcon = new ImageView(new Image(getClass().getResourceAsStream("/icons/edit.png")));
                editIcon.setFitHeight(16);
                editIcon.setFitWidth(16);
                editBtn.setGraphic(editIcon);

                ImageView deleteIcon = new ImageView(new Image(getClass().getResourceAsStream("/icons/delete.png")));
                deleteIcon.setFitHeight(16);
                deleteIcon.setFitWidth(16);
                deleteBtn.setGraphic(deleteIcon);

                editBtn.setStyle("-fx-background-color: transparent;");
                deleteBtn.setStyle("-fx-background-color: transparent;");
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    HBox hbox = new HBox(10, editBtn, deleteBtn);
                    hbox.setAlignment(Pos.CENTER);
                    setGraphic(hbox);
                }
            }
        });

        tableView.getColumns().addAll(noCol, titleCol, authorCol, genreCol, formatCol, dateCol, sizeCol, actionCol);
        BorderPane layout = new BorderPane(tableView);
        layout.setPadding(new Insets(10));
        node=layout;
    }

    private ObservableList<ComputerFile> getDummyData() {
    	Database instance = Database.getInstance();
    	ArrayList<ComputerFile>biData= instance.getInstance().getCompData();  
        return FXCollections.observableArrayList(biData);
    }

    public Node getNode() {
        return tableView;
    }
}
