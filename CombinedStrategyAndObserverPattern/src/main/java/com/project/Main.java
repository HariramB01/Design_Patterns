package com.project;

import com.project.*;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create notification strategies
        NotificationStrategy emailNotification = new EmailNotification();
        NotificationStrategy smsNotification = new SMSNotification();
        NotificationStrategy pushNotification = new PushNotification();

        // Create user action subject (observable)
        UserActionSubject userActionSubject = new UserActionSubject();

        // Create and add observers
        Observer analyticsObserver = new AnalyticsObserver();
        Observer loggingObserver = new LoggingObserver();

        userActionSubject.addObserver(analyticsObserver);
        userActionSubject.addObserver(loggingObserver);

        // Simulate user actions
        String user = "JohnDoe";

        // User posts a comment
        emailNotification.sendNotification("You have a new comment!", user);
        userActionSubject.notifyObservers("posted a comment", user);

        // User likes a post
        smsNotification.sendNotification("Your post got a like!", user);
        userActionSubject.notifyObservers("liked a post", user);

        // User shares a post
        pushNotification.sendNotification("Your post was shared!", user);
        userActionSubject.notifyObservers("shared a post", user);
    }
}
