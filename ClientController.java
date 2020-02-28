package MAIN;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
public class ClientController {

    Misc misc = new Misc();
    MainController user = new MainController();
    String userID = user.getUsername();
    public TextArea chatWindowClient = null;
    public TextField textInputClient = null;


    public void clientChat() throws IOException {
        misc.openWindow("clientWindow.fxml", "client Chat", 640, 413);
        System.out.println(userID);
    }
    public void sendButton(ActionEvent event){
        misc.textWriter(textInputClient, chatWindowClient, userID);
    }
}