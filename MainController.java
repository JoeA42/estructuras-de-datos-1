package MAIN;

import javafx.event.*;
import javafx.scene.control.*;
import java.io.*;

public class MainController{

    public RadioButton clientToggle = null;
    public RadioButton serverToggle = null;
    public TextField textInputClient = null;
    public TextField userID = null;
    public TextArea chatWindowClient = null;
    public Button errorWindowOk = null;

    public void optionSelect(ActionEvent event) {
        if(clientToggle.isSelected()){
            serverToggle.setSelected(false);
            System.out.println("cliente seleccionado");
        }
        else if(serverToggle.isSelected()){
            clientToggle.setSelected(false);
            System.out.println("servidor seleccionado");
        }

    }

    public String runButton(ActionEvent event) throws IOException {
        String user = userID.getText();
        System.out.println(user);
        if(userID.getText().isEmpty()) {
            ErrorController newWindow = new ErrorController();
            System.out.println("ingrese un usuario valido");
            newWindow.errorWindow();
        }

        else if(clientToggle.isSelected()) {
            ClientController newWindow = new ClientController();
            newWindow.clientChat();
        }

        else if(serverToggle.isSelected()){
            ServerController newWindow = new ServerController();
            newWindow.serverChat();
        }

        return null;
    }
    public String getUsername(){
        String user = userID.getText();
        userID.clear();
        return user;

    }
}


