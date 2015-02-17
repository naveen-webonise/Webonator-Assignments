package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML private TableView<Person> tableView;
    @FXML private TableColumn<Person, String> firstName;
    @FXML private TableColumn<Person, String> lastName;
    @FXML private TableColumn<Person, String> email;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML public void addPerson(ActionEvent event){
        data.add(new Person(firstNameField.getText(),lastNameField.getText(),emailField.getText()));
        tableView.setItems(data);
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }

    ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("naveen","patil","nmp@gmail.com")
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      firstName.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        email.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        tableView.setItems(data);

    }
}
