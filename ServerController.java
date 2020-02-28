package MAIN;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ServerController {

    Misc misc = new Misc();

    public void serverChat() throws IOException {
        misc.openWindow("serverWindow.fxml", "client Chat", 640, 413);
    }
}
