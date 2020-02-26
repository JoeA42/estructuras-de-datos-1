package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;


public class Controller {

    public TextArea chatWindow;
    public TextField textInput;
    public MenuItem ipConnection;

    public void pressButton(ActionEvent event){
        String user = "User: ";
        String text = textInput.getText();
        textInput.clear();
        chatWindow.appendText(user + text + "\n");


    }
    }


