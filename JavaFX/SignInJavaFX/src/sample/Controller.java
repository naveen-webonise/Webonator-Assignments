package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;




public class Controller {
    @FXML private TextField userName;
    @FXML private PasswordField passwordField;

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
}
