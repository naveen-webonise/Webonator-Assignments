package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma", 30));
		gridpane.add(sceneTitle,0,0,2,1);
		
		Label label = new Label("UserName:");
		gridpane.add(label, 0, 1);
		
		TextField userField = new TextField();
		gridpane.add(userField, 1, 1);
		
		Label password = new Label("Password");
		gridpane.add(password, 0, 2);
		
		TextField passwordField = new TextField();
		gridpane.add(passwordField, 1, 2);
		
		Button button = new Button("Sign In");
		HBox hbox = new HBox();
		hbox.getChildren().add(button);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		gridpane.add(hbox, 1, 3);
		
		Text output = new Text();
		gridpane.add(output, 1, 4);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				output.setText("button pressed");
				
			}
		});
		
		//gridpane.setGridLinesVisible(true);
		
		Scene scene = new Scene(gridpane,300,300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Form");
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}