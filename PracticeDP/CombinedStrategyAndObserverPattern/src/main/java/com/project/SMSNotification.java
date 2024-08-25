package com.project;

public class SMSNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String action, String user) {
        System.out.println("SMS sent to "+user+ " : "+action);
    }
}
