# Design Pattern 

This repository contains implementations of various Design Patterns in Java.

- [1. Creational](#1-creational)
   - [1a. Singleton](#1a-singleton)
   - [1b. Factory](#1b-factory)
   - [1c. Builder](#1c-builder)
   - [1d. Prototype](#1d-prototype)
   - [1e. Abstract Factory](#1e-abstract-factory)

- [2. Structural](#2-structural)
   - [2a. Adapter](#2a-adapter)
   - [2b. Bridge](#2b-bridge)
   - [2c. Composite](#2c-composite)
   - [2d. Decorator](#2d-decorator)
   - [2e. Facade](#2e-facade)
   - [2f. Flyweight](#2f-flyweight)
   - [2g. Proxy](#2g-proxy)

- [3. Behavioral](#3-behavioral)
   - [3a. Chain of Responsibility](#3a-chain-of-responsibility)
   - [3b. Command](#3b-command)
   - [3c. Interpreter](#3c-interpreter)
   - [3d. Iterator](#3d-iterator)
   - [3e. Mediator](#3e-mediator)   
   - [3f. Memento](#3f-memento)
   - [3g. Observer](#3g-observer)
   - [3h. State](#3h-state)
   - [3i. Strategy](#3i-strategy)
   - [3j. Template Method](#3j-template-method)
   - [3k. Visitor](#3k-visitor)


---

## 1. Creational
### 1a. Singleton
> The **Singleton** pattern guarantees that a class has only one instance and provides a global access point to it. This is used to control access to a shared resource, like a single database connection or configuration file.
```sh
# enter directory
cd creational/singleton
# compile
javac LoggerSingletonTest.java
# run
java LoggerSingletonTest
```
### 1b. Factory
> The Factory Method defines an interface for creating an object, but lets subclasses decide which class to instantiate. This allows a class to defer instantiation to its subclasses, promoting loose coupling.
```sh
# enter directory
cd creational/factory_method 
# compile
javac Main.java
# run
java Main 
```
### 1c. Builder
> The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It lets you build complex objects step-by-step, making the creation process more manageable.
```sh
# enter directory
cd creational/builder 
# compile
javac Main.java
# run
java Main 
```
### 1d. Prototype
> The Prototype pattern lets you create new objects by copying an existing object (a "prototype") rather than creating one from scratch. This is used to avoid the high cost of standard creation and to easily produce variations of an object.
```sh
# enter directory
cd creational/prototype 
# compile
javac Main.java
# run
java Main 
```
### 1e. Abstract Factory
> The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This allows you to produce different variations (e.g., UI elements for Windows, macOS, or Linux) using the same client code.
```sh
# enter directory
cd creational/abstract_factory 
# compile
javac *.java
# run
java Main solana
```


## 2. Structural
### 2a. Adapter
> The Adapter pattern acts as a bridge between two incompatible interfaces, allowing them to work together. It wraps an existing class (the adaptee) with a new interface (the adapter) that the client code can understand.
```sh
# enter directory
cd creational/adaptor 
# compile
javac *.java
# run
java Main solana
```
### 2b. Bridge
### 2c. Composite
### 2d. Decorator
### 2e. Facade
### 2f. Flyweight
### 2g. Proxy


## 3. Behavioral
### 3a. Chain of Responsibility
### 3b. Command
### 3c. Interpreter
### 3d. Iterator
### 3e. Mediator
### 3f. Memento
### 3g. Observer
### 3h. State
### 3i. Strategy
### 3j. Template Method
### 3k. Visitor