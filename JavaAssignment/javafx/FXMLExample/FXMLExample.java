package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLExample extends Application{

	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
		
		Scene scene = new Scene(root,300,250);
		
		primaryStage.setTitle("Welcome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
}