package com.edu.gof.structural.adapter;

public class JsonAdapter implements DataReader<Person> {

    @Override
    public Person readData(String filePath) {
        //        Read json data from file, parse it and convert to Person


        return Person.builder()
                .name("Pranav")
                .build();
    }
}
