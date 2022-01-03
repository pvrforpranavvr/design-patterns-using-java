### Builder Design Pattern

* Creational design pattern to limit the object creation to one.

### How can we achieve

* Pojo class with getters and setters
* static Inner builder class with constructor for each single fields.
* static builder method that returns builder object
* public build method that will create new object