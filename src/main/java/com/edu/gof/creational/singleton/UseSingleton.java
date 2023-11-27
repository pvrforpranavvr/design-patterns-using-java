package com.edu.gof.creational.singleton;

public class UseSingleton {

    public static void main(String[] args) {

        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();


        if (singletonPattern1 == singletonPattern2) {

            System.out.println(">>> Same object <<<");
        }

    }
}
