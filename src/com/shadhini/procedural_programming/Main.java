package com.shadhini.procedural_programming;

public class Main {

    // here Main method will be soo bloated
    // we have bunch of variables and bunch of functions(procedures) --> Procedural Programming
    // if you are constantly calling methods and passing so may arguments, that means you're doing procedural programming

    // if something goes wrong you have to go all over the code and figure out what you need to change.
    // as soon as you change something, so many things can break
    // and you will create other bugs in your program
    // lack of reusability: you need to copy paste code snippets from here and there and then they have different arguments to pass and arguments are not matching

    // ==> spaghetti code, code like spaghetti
    // everything is interconnected with each other
    // it's really hard to change programs like this

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary + (extraHours*hourlyRate);
    }
}
