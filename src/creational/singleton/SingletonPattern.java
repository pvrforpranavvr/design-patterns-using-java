package creational.singleton;

public class SingletonPattern {

    private static SingletonPattern singletonPattern=null;

    private SingletonPattern() {

    }


    public static SingletonPattern getInstance() {

        if (singletonPattern == null) {

            synchronized (SingletonPattern.class) {

                if (singletonPattern == null) {

                    singletonPattern = new SingletonPattern();
                }
            }
        }

        return singletonPattern;
    }
}
