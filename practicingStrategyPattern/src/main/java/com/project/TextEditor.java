package com.project;

public class TextEditor {

    private TextFormatter textFormatter;

    public TextEditor(LowerCaseFormatter lowerCaseFormatter) {
        textFormatter = lowerCaseFormatter;
    }

    public String setTextFormatter(){
        return textFormatter.print();
    }

    public void changeTextFormatter(TextFormatter newTextFormatter){
        textFormatter = newTextFormatter;
    }

}
