package com.project;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TextEditor textEditor = new TextEditor(new LowerCaseFormatter());

        System.out.println(textEditor.setTextFormatter());

        textEditor.changeTextFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.setTextFormatter());

        textEditor.changeTextFormatter(new CapitalLetterFormatter());
        System.out.println(textEditor.setTextFormatter());

        textEditor.changeTextFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.setTextFormatter());

    }
}