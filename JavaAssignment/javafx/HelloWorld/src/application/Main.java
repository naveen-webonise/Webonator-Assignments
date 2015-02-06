package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button button = new Button();
		button.setText("Click Here");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				button.setText("Clicked");
				
			}
			
		});
		
		StackPane stackpane = new StackPane();
		stackpane.getChildren().add(button);
		
		Scene scene = new Scene(stackpane,300,300);
		
		primaryStage.setTitle("First JavaFX Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
