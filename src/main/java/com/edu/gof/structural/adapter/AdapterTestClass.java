package com.edu.gof.structural.adapter;

public class AdapterTestClass {

    public static void main(String[] args) {

        DataReader<Person> reader = new JsonAdapter();

        var person = reader.readData("/path/to/file");
        System.out.println(person);
    }
}


