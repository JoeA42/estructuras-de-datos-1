package com.main;

public class GetUser {
    ActiveUsers activeUsers = new ActiveUsers();

    public void lastUser(){
        System.out.println(activeUsers.activeUserList.get(activeUsers.activeUserList.size()-1));
        //return user;
    }
}
