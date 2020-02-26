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
    public Button sendButton;


    public void pressButton(ActionEvent event) {
        System.out.println("AIUDA");

    }

    public void sendButton(ActionEvent event) throws IOException {
        String user = "User: ";
        String text = textInput.getText();
        textInput.clear();
        chatWindow.appendText(user + text + "\n");

    }

    public void connectIP(ActionEvent actionEvent) throws IOException {
        GuiControls ppw = new GuiControls();
        ppw.openPopup("ipConnection.fxml");
    }

    public void userName(ActionEvent actionEvent) throws IOException {
        GuiControls ppw = new GuiControls();
        ppw.openPopup("userName.fxml");
    }

}


