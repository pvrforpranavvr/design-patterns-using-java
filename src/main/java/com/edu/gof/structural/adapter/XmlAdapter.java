package com.edu.gof.structural.adapter;

public class XmlAdapter implements DataReader<Person> {
    @Override
    public Person readData(String filePath) {
        //        Read xml data from file, parse it and convert to Person


        return Person.builder()
                .name("Pranav")
                .build();
    }
}
