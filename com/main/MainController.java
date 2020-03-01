package com.main;

import com.loom.Spool;
import javafx.event.*;
import javafx.scene.control.*;
import java.io.*;

public class MainController {

    public TextField userID = null;
    ActiveUsers activeUsers = new ActiveUsers();

    public void openButton(ActionEvent event) throws IOException {
        if (userID.getText().isEmpty()) {
            ErrorController errorController = new ErrorController();
            System.out.println("please enter a valid username");
            errorController.errorWindow();
        } else {
            System.out.println("starting chat window...");
            String user = userID.getText();
            System.out.println(user + " has entered the chat");
            userID.clear();
            //activeUsers.getUser(user);
            ClientController clientController = new ClientController();
            clientController.clientChat(user);
        }
    }
    public void serverLog(ActionEvent event) throws IOException {
        ServerController serverController = new ServerController();
        serverController.serverLog();
    }
}


