package com.main;

import java.util.ArrayList;

public class ActiveUsers {

    public ArrayList<String> activeUserList = new ArrayList<>();

    public void getUser(String user) {
        activeUserList.add(user);
        System.out.println(activeUserList.get(activeUserList.size()-1));

    }

}
