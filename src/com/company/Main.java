package com.company;

public class Main {

    public static void main(String[] args) {


        String name = "Chandrika";

        if (name == "Mary") {
            System.out.println("This is not the right person");
        } else if (name == "Laura") {
            System.out.println("This is the wrong person");
        } else if (name == "Jerry") {
            System.out.println("This is also the wrong person");
        } else if (name == "Chandrika") {
            System.out.println("This is the right person");
        } else {
            System.out.println("No one exist in the name of Chandrika");
        }
    }
}
