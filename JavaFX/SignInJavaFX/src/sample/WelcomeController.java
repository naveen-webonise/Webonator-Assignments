package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class WelcomeController {
    @FXML private Text welcomeText;
    private Parent parent;
    private Scene scene;
    private Stage stage;

    public WelcomeController(){
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("welcome.fxml"));
        fxmlLoader.setController(this);
        try {
            parent=(Parent) fxmlLoader.load();
            scene=new Scene(parent,600,400);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reDirectHome(Stage stage, String name)throws IOException{
        stage.setTitle("Home");
        stage.setScene(scene);
        welcomeText.setText("Hello "+ name + "! You are Welcome");
        stage.hide();
        stage.show();
    }
}
