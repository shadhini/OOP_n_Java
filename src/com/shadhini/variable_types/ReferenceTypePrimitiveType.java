package com.shadhini.variable_types;

public class ReferenceTypePrimitiveType {

    public static void main(String[] args) {

        // Reference Type
        // ---------------------

        var textBox1 = new TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Hello World");
        System.out.println(textBox1.text);

        // both these variables are referencing the same object
        // that means if I modify that object through one of these references or one of these variables,
        // the changes would be visible through the other variable


    }
}
