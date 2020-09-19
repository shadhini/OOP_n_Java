package com.shadhini.classes_n_objects;

public class CreatingClassesObjects {

    public static void main(String[] args) {
        // instantiating TextBox class
        TextBox textBox1 = new TextBox();

        // better way: use "var" keyword --> shorter and cleaner code
        var textBox2 = new TextBox();
        // here, the Java compiler will determine the type of the variable based on what we have on the right side of the assignment operation
        // "var" keyword is different from what we have in JavaScript
        // in JavaScript, with "vae" keyword we can declare variable and give it different types of values
        // but in Java, variables have static types
        // once we set the type of a variable, we cannot change it throughout the lifetime of the program


        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        System.out.println(textBox1.text); // --> null
        // text field in TextBox class is  String object. Strings are reference types.
        // by default, if we don't initialize these reference types, it's set to null

        // These nulls can be dangerous and hey can crash our program
        System.out.println(textBox1.text.toUpperCase()); // --> program crashes --> NullPointer Exception
        // here textBox1.text is null and it's not referencing a real object in memory
        // and here, we are trying to call toUpperCase() method on an object that doesn't exist
        // that's why we are getting NullPointer Exception

        // to prevent this, initialize fields --> TextBoxInitialized class
        var textBoxInitialized1 = new TextBoxInitialized();
        System.out.println(textBoxInitialized1.text.toUpperCase());
        textBoxInitialized1.setText("Initialized Box 1");
        System.out.println(textBoxInitialized1.text.toUpperCase());

        var textBoxInitialized2 = new TextBoxInitialized();
        textBoxInitialized2.setText("Initialized Box 2");
        System.out.println(textBoxInitialized2.text);



    }
}
