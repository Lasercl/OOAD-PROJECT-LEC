package view;

import java.util.ArrayList;

import database.Database;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.bibliography.Bibliography;

public class DisplayAllView extends Application implements EventHandler<ActionEvent>{
	public static Database instance = Database.getInstance();
	public static ArrayList<Bibliography>biData= instance.getInstance().getBiData();
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
