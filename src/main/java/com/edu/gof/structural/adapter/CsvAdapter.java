package com.edu.gof.structural.adapter;

public class CsvAdapter implements DataReader<Person>{

    @Override
    public Person readData(String filePath) {

//        Read csv data from file, parse it and convert to Person
        return Person.builder()
                .name("Pranav")
                .build();
    }
}
