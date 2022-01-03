### Template Method

* Behavioral design pattern that allows to define the skeleton of the algorithm in base class and subclasses override the steps without changing the overall structure.

### How can we achieve

* Constructor should be private to avoid external initialization of the class

* public static getInstance method that returns the instance of the class.

* getInstance method should be thread safe. Use class level lock.