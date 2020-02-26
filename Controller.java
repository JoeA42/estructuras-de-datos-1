package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static javafx.fxml.FXMLLoader.*;


public class Controller {

    public TextArea chatWindow;
    public TextField textInput;
    public MenuItem ipConnection;
    public Button ipButton;

    public void pressButton(ActionEvent event) {
        String user = "User: ";
        String text = textInput.getText();
        textInput.clear();
        chatWindow.appendText(user + text + "\n");

    }

    public void connectIP(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("ipConnection.fxml").openStream());
        stage.setScene(new Scene(root, 240, 180));
        stage.showAndWait();

    }

    public void userName(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("userName.fxml").openStream());
        stage.setScene(new Scene(root, 240, 180));
        stage.showAndWait();
    }

}


