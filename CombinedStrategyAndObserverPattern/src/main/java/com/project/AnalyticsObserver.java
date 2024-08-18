package com.project;


public class AnalyticsObserver implements Observer{
    private String action;
    private String user;
    @Override
    public void update(String action, String user) {
        this.action = action;
        this.user = user;
        display();
    }

    private void display() {
        System.out.println("Analytics : "+user + " performed : "+action);
    }
}
