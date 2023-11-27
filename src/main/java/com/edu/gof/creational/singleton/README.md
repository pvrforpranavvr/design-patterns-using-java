### Singleton Design Pattern

* Creational design pattern to limit the object creation to one.

### How can we achieve

* Constructor should be private to avoid external initialization of the class

* public static getInstance method that returns the instance of the class.

* getInstance method should be thread safe. Use class level lock.