### Template Method

* Behavioral design pattern that allows to define the skeleton of the algorithm in base class and subclasses override the steps without changing the overall structure.

### How can we achieve

* Create an abstract class that will contain a template method, default implementations and abstract methods
* Template method should be final so that subclass won't override
* Default implementations may or maynot be overridden based on the subclass implementation
* Abstract methods will be implemented by subclasses