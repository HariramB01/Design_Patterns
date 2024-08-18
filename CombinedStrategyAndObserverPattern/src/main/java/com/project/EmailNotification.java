package com.project;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String action, String user) {
        System.out.println("Email sent to "+user+ " : "+action);
    }
}
