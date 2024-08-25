package com.project;

public class PushNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String action, String user) {
        System.out.println("Push sent to "+user+ " : "+action);
    }
}
