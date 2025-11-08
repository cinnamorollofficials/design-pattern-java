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
cd structural/adaptor 
# compile
javac *.java
# run
java Main solana
```
### 2b. Bridge
> The Bridge pattern decouples an abstraction from its implementation, allowing the two to vary independently. This is useful when you have multiple dimensions of variation (e.g., different shapes and different rendering methods) and want to avoid a class explosion.
```sh
# enter directory
cd structural/bridge 
# compile
javac *.java
# run
# Native transfer di EVM (amount dalam wei - demo):
java Main evm native 0xFrom 0xTo 100000000000000000 priv_demo_key

# Token transfer di EVM (token = ERC-20 address):
java Main evm token 0xFrom 0xTo 100000000000000000 0xTokenAddress

# Native transfer di Solana (amount dalam lamports - demo):
java Main solana native FromSoL ToSoL 200000000 priv_demo_key

# Token transfer di Solana (token = SPL mint):
java Main solana token FromSoL ToSoL 500000000 SoL_Mint_ABC
```
### 2c. Composite
> The **Composite** pattern allows you to compose objects into tree structures to represent part-whole hierarchies. This lets clients treat individual objects (leaves) and compositions of objects (composites) uniformly through a shared interface.
```sh
# enter directory
cd structural/composite 
# compile
javac *.java
# run
java Main
```
### 2d. Decorator
> The **Decorator** pattern dynamically attaches new behaviors or responsibilities to an object without altering its code. It wraps the original object, allowing you to add functionality at runtime, layer by layer, as a flexible alternative to subclassing.
```sh
# enter directory
cd structural/decorator 
# compile
javac *.java
# run
java Main
```
### 2e. Facade
> The **Facade** pattern provides a simplified, unified interface to a complex subsystem of classes, libraries, or frameworks. It hides the system's complexity and makes it easier to use by providing a single, high-level entry point.
```sh
# enter directory
cd structural/facade 
# compile
javac *.java
# run
java Main
```
### 2f. Flyweight
> The Flyweight pattern minimizes memory usage by sharing as much data as possible with other similar objects. It is used when you need to create a vast number of objects that share common (intrinsic) state, while storing their unique (extrinsic) state externally.
```sh
# enter directory
cd structural/flyweight 
# compile
javac *.java
# run
java Main
```
### 2g. Proxy
> The Proxy pattern provides a surrogate or placeholder for another object to control access to it. This is used to manage the original object's lifecycle, add security, enable lazy initialization, or handle remote access transparently.
```sh
# enter directory
cd structural/proxy 
# compile
javac *.java
# run
java Main
```


## 3. Behavioral
### 3a. Chain of Responsibility
> The Chain of Responsibility pattern passes a request along a chain of handlers, allowing multiple objects to process it. Each handler decides either to process the request or to pass it to the next handler in the chain, decoupling the sender from the receiver.
```sh
# enter directory
cd behavioral/chain-of-responsibility
# compile
javac *.java
# run
java Main
```
### 3b. Command
> The Command pattern turns a request into a stand-alone object (a "command") that contains all information about the request. This allows you to parameterize methods with different requests, queue or log requests, and support undoable operations.
```sh
# enter directory
cd behavioral/command
# compile
javac *.java
# run
java Main
```
### 3c. Interpreter
> The Interpreter pattern defines a grammatical representation for a language and provides an interpreter to execute that grammar. This is used to build components, like query parsers or scripting engines, that can process and act on sentences in that language.
```sh
# enter directory
cd behavioral/interpreter
# compile
javac *.java
# run
java Main
```
### 3d. Iterator
> The Iterator pattern provides a standard way to traverse the elements of a collection sequentially without exposing its underlying representation. This allows you to browse any collection (like a list, tree, or graph) using a uniform interface.
```sh
# enter directory
cd behavioral/iterator
# compile
javac *.java
# run
java Main
```
### 3e. Mediator
> The Mediator pattern reduces complex dependencies between objects by introducing a central "mediator" object that handles all communication. This promotes loose coupling by forcing objects to interact only through the mediator, rather than directly with each other.
```sh
# enter directory
cd behavioral/mediator
# compile
javac *.java
# run
java Main
```
### 3f. Memento
> The Memento pattern captures and externalizes an object's internal state without violating encapsulation, allowing the object to be restored to this state later. This is commonly used to implement undo/redo functionality or to create save points in an application.
```sh
# enter directory
cd behavioral/memento
# compile
javac *.java
# run
java Main
```
### 3g. Observer
> The Observer pattern defines a one-to-many dependency where an object (the "subject") notifies a list of dependent objects ("observers") of any state changes. This allows observers to react to changes automatically without the subject needing to know who they are.
```sh
# enter directory
cd behavioral/observer
# compile
javac *.java
# run
java Main
```
### 3h. State
> The State pattern allows an object to alter its behavior when its internal state changes, making the object appear to change its class. It encapsulates state-specific behaviors into separate "state" objects, cleaning up complex conditional logic.
```sh
# enter directory
cd behavioral/state
# compile
javac *.java
# run
java Main
```
### 3i. Strategy
> The Strategy pattern defines a family of interchangeable algorithms and encapsulates each one in its own class. This allows the client code to select and swap the "strategy" (algorithm) it uses at runtime, independent of the object that uses it.
```sh
# enter directory
cd behavioral/strategy
# compile
javac *.java
# run
java Main
```
### 3j. Template Method
> The Template Method pattern defines the skeleton of an algorithm in a superclass but lets subclasses override specific steps. This allows subclasses to redefine parts of the algorithm without changing its overall structure.
```sh
# enter directory
cd behavioral/template
# compile
javac *.java
# run
java Main
```
### 3k. Visitor
> The Visitor pattern lets you add new operations to a complex object structure (like a tree) without modifying the classes of the objects themselves. It separates the algorithm from the objects it operates on, allowing new behaviors to be added by creating new visitor classes.
```sh
# enter directory
cd behavioral/visitor
# compile
javac *.java
# run
java Main
```