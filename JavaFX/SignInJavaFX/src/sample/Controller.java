package sample;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML public Button button;
    @FXML private TextField userName;
    @FXML private PasswordField passwordField;
    @FXML private Label user;

    private WelcomeController welcomeController;
    private Scene scene;
    private Stage stage;
    private Parent parent;

    public Controller(){
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("sample.fxml"));
        fxmlLoader.setController(this);
        try {
            parent=(Parent) fxmlLoader.load();
            scene=new Scene(parent,600,400);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void launchLoginController(Stage stage){

        this.stage=stage;
        stage.setTitle("User Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML public void handleSubmitButtonAction(ActionEvent event)throws IOException{
        if(userName.getText().trim().length()>0){
            welcomeController =new WelcomeController();
            welcomeController.reDirectHome(stage,userName.getText().trim());
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         user.textProperty().bind(userName.textProperty());
        button.disableProperty().bind(Bindings.or(userName.textProperty().isEqualTo(""),passwordField.textProperty().isEqualTo("")));

    }
}
