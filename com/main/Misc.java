package com.main;

import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import java.io.*;

public class Misc {

    public void openWindow(String window, String title, int width, int height) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource(window).openStream());
        stage.setTitle(title);
        stage.setScene(new Scene(root, width, height));
        stage.showAndWait();
    }

    public void textWriter(TextField textInput, TextArea chatWindow, String user){
        String text = textInput.getText();
        textInput.clear();
        chatWindow.appendText(user +": "+ text + "\n");
    }

}

