package sample;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
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
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/sample.fxml"));
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
//        if(userName.getText().trim().length()>0){
//            welcomeController =new WelcomeController();
//            welcomeController.reDirectHome(stage,userName.getText().trim());
//        }

        Client client = Client.create();
        WebResource webResource = client.resource(URI.create("https://www.datamapper.com/api/v1/accounts/sign_in"));
        HashMap formData = new HashMap();
        formData.put("username",userName.getText().toString());
        formData.put("password",passwordField.getText().toString());
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject;
        try {
            jsonObject = mapper.writeValueAsString(formData);



            ClientResponse response = webResource.header("auth_token", null)
                    .type(MediaType.APPLICATION_FORM_URLENCODED)
                    .accept(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class, jsonObject.toString());
            String jsonData = response.getEntity(String.class);
            MyResponse myResponse = mapper.readValue(jsonData,MyResponse.class);
            welcomeController =new WelcomeController();
            welcomeController.reDirectHome(stage,myResponse);
            System.out.println("MyResponse class contents: "+myResponse);

            int status = response.getStatus();

            Response.StatusType msg = response.getStatusInfo();
            System.out.println(status);
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         user.textProperty().bind(userName.textProperty());
        button.disableProperty().bind(Bindings.or(userName.textProperty().isEqualTo(""),passwordField.textProperty().isEqualTo("")));

    }
}
