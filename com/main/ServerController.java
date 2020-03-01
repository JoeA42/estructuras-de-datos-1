package com.main;

import java.io.IOException;

public class ServerController {

    Misc misc = new Misc();

    public void serverLog() throws IOException {
        misc.openWindow("../resources/serverWindow.fxml", "server Chat", 515, 357);
    }
}
