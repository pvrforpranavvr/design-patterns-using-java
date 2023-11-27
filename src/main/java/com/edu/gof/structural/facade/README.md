# Facade

Facade decreases the overall complexity of the application, it also helps to move unwanted dependencies to one place.

### How to achieve

* Create a facade class
* Inject all dependencies in the facade class

### When to use

* If you want to use a method from multiple service class in a service class then create facade and inject all services in facade and use facade to inject in the controller class. Injecting another service in a service is not a good practice.

### Realtime Example

* Purchase a product
  * OrderService
  * PaymentService
  * MailService