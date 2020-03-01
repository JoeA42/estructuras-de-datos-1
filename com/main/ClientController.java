package com.main;

import com.loom.Spool;
import javafx.scene.control.*;

import java.io.IOException;

public class ClientController {

    String userName;
    Misc misc = new Misc();
    GetUser getUser = new GetUser();
    public TextArea chatWindowClient = null;
    public TextField textInputClient = null;

    //@Override
    //public void initialize(URL url, ResourceBundle resourceBundle) {
    //getUser.lastUser();
    //}

    public void clientChat(String userName) throws IOException {
        Spool thread = new Spool();
        thread.start();
        misc.openWindow("../resources/clientWindow.fxml", userName + "'s Chat", 640, 413);
    }

    public void sendButton(javafx.event.ActionEvent actionEvent) {
        misc.textWriter(textInputClient,chatWindowClient, userName);
    }

}