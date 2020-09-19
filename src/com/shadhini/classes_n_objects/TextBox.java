package com.shadhini.classes_n_objects;

// a class definition
public class TextBox {
    // class name: Pascal naming convention

    // public <-- the access modifier; determines which other classes in this project can use this class or not

    // members
    public String text; // field

    public void setText(String text){
        // "this" is a reference to the current object
        this.text = text; // use this as there are 2 variables with the same name
    }

    public void clear(){
        text = "";
    }

}
