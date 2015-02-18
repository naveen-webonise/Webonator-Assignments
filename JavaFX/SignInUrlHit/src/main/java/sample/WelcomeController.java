package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class WelcomeController {
    @FXML private Text welcomeText;
    private Parent parent;
    private Scene scene;
    private Stage stage;

    public WelcomeController(){
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/welcome.fxml"));
        fxmlLoader.setController(this);
        try {
            parent=(Parent) fxmlLoader.load();
            scene=new Scene(parent,600,400);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reDirectHome(Stage stage, MyResponse myResponse)throws IOException{
        stage.setTitle("Home");
        stage.setScene(scene);
        welcomeText.setText(String.valueOf(myResponse));
        stage.hide();
        stage.show();
    }
}
