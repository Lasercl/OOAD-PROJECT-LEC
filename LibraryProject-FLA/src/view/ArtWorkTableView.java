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
import model.artwork.Artwork;
import model.book.Book;

public class ArtWorkTableView {
    private Node scene;

    public ArtWorkTableView() {
       
        TableView<Artwork> table = new TableView<>();

        TableColumn<Artwork, Integer> noCol = new TableColumn<>("NO");
        noCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        noCol.setPrefWidth(40);

        TableColumn<Artwork, String> titleCol = new TableColumn<>("TITLE");
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        titleCol.setPrefWidth(100);

        TableColumn<Artwork, String> authorCol = new TableColumn<>("AUTHOR NAME . DOB . COUNTRY");
        authorCol.setCellValueFactory(new PropertyValueFactory<>("authorDetails"));
        authorCol.setPrefWidth(180);

        TableColumn<Artwork, String> genreCol = new TableColumn<>("GENRE");
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        genreCol.setPrefWidth(80);

        TableColumn<Artwork, String> yearCol = new TableColumn<>("YEAR OF PUBLICATION");
        yearCol.setCellValueFactory(new PropertyValueFactory<>("yearOfPublication"));
        yearCol.setPrefWidth(120);

        TableColumn<Artwork, String> typeCol = new TableColumn<>("ART TYPE");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("artType"));
        typeCol.setPrefWidth(80);

        TableColumn<Artwork, String> styleCol = new TableColumn<>("ART STYLE");
        styleCol.setCellValueFactory(new PropertyValueFactory<>("artStyle"));
        styleCol.setPrefWidth(100);

        TableColumn<Artwork, String> movementCol = new TableColumn<>("ART MOVEMENT");
        movementCol.setCellValueFactory(new PropertyValueFactory<>("artMovement"));
        movementCol.setPrefWidth(120);

        // ACTION COLUMN
        TableColumn<Artwork, Void> actionCol = new TableColumn<>("ACTION");
        actionCol.setPrefWidth(80);
        actionCol.setCellFactory(param -> new TableCell<Artwork,Void>() {
            private final Button editBtn = new Button();
            private final Button deleteBtn = new Button();
            private final HBox actionBox = new HBox(5, editBtn, deleteBtn);

            {
                editBtn.setGraphic(new ImageView(new Image("/icons/edit.png")));
                deleteBtn.setGraphic(new ImageView(new Image("/icons/delete.png")));
                actionBox.setAlignment(Pos.CENTER);
                editBtn.setOnAction(e -> {
                    Artwork selected = getTableView().getItems().get(getIndex());
                    System.out.println("Edit: " + selected.getTitle());
                    // Handle edit logic here
                });
                deleteBtn.setOnAction(e -> {
                    Artwork selected = getTableView().getItems().get(getIndex());
                    System.out.println("Delete: " + selected.getTitle());
                    getTableView().getItems().remove(selected);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(actionBox);
                }
            }
        });

        table.getColumns().addAll(noCol, titleCol, authorCol, genreCol, yearCol, typeCol, styleCol, movementCol, actionCol);
        table.setItems(getDataList());
        BorderPane layout = new BorderPane(table);
        layout.setPadding(new Insets(10));
        scene = layout;
    }

	private static ObservableList<Artwork> getDataList() {
		// TODO Auto-generated method stub
		Database instance = Database.getInstance();
    	ArrayList<Artwork>artData= instance.getInstance().getArtData();    
        return FXCollections.observableArrayList(artData)	;
    }
	public Node getNode() {
        return scene;
    }
}
