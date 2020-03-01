package com.loom;

public class Spool extends Thread{

    public static int numberOfObjects=0;

    public Spool(){
        numberOfObjects++;
    }

    public void run(){
        if(numberOfObjects==1){
            System.out.println("Server Thread running");
        }
        else{
            System.out.println("Client Thread "+(numberOfObjects-1)+" running");
        }

    }
}