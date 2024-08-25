package com.pattern;


public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("localhost").port("8080");
        URLBuilder urlBuilder = builder.build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);


    }
}
