package com.edu.gof.structural.adapter;

public interface DataReader<T> {
    T readData(String filePath);
}
