# Java Design Patterns

As a solution architect working with Spring Boot applications, understanding **Java Design Patterns** is crucial. Let me explain why:

1. **Code Reusability and Maintainability**:
    - Design patterns provide proven solutions to common software design challenges. By using these patterns, you can create more maintainable, flexible, and understandable code.
    - As a solution architect, you'll be able to guide your development teams in implementing reusable solutions, reducing redundancy, and improving code quality.

2. **Scalability and Consistency**:
    - Design patterns help establish consistent practices across your projects. When multiple teams work on different parts of an application, adhering to design patterns ensures a cohesive architecture.
    - As a solution architect, you can recommend specific patterns to handle scalability concerns, such as load balancing, caching, and database access.

3. **Reduced Development Time**:
    - Design patterns encapsulate the expertise of seasoned architects and developers. By following established patterns, your teams can avoid reinventing the wheel and accelerate development.
    - As a solution architect, you'll streamline the development process by suggesting appropriate patterns for specific use cases.

4. **Improved Communication**:
    - Design patterns serve as a common language among developers. When discussing architectural decisions, using pattern names helps everyone understand the intended solution.
    - As a solution architect, you'll facilitate effective communication by referring to well-known patterns during design discussions.

5. **Types of Design Patterns**:
    - **Creational Patterns**: Focus on object creation (e.g., Factory Method, Singleton). These patterns help manage how objects are instantiated.
    - **Structural Patterns**: Deal with class composition and relationships (e.g., Adapter, Decorator). They enhance code organization and collaboration.
    - **Behavioral Patterns**: Address communication between objects (e.g., Observer, Strategy). These patterns define interactions and responsibilities.

In summary, learning Java Design Patterns equips you with a toolbox of solutions to common problems, making you an effective solution architect who guides teams toward robust, maintainable, and scalable Spring Boot applications. 🌟🚀¹²³

Source: Conversation with Bing, 16/05/2024
- (1) Design Patterns in Java - GeeksforGeeks. https://www.geeksforgeeks.org/java-design-patterns/.
- (2) Java Design Patterns - Example Tutorial | DigitalOcean. https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial.
- (3) Java Design Patterns: A Guide to Architecting Robust and Maintainable .... https://sourcebae.com/blog/java-design-patterns-a-guide-to-architecting-robust-and-maintainable-code/.
- (4) goodreads.com. https://www.goodreads.com/book/show/85009.Design_Patterns.

## Creational Patterns

## Structural Patterns

### Decorator Pattern
Certainly! The **Decorator design pattern** allows you to dynamically add functionality and behavior to an object without affecting other existing objects within the same class. Here's a simple example in Java:

1. **Create an interface named `Shape`**:
    ```java
    public interface Shape {
        void draw();
    }
    ```

2. **Implement concrete classes** for `Rectangle` and `Circle`:
    ```java
    public class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Shape: Rectangle");
        }
    }

    public class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Shape: Circle");
        }
    }
    ```

3. **Create an abstract decorator class** (`ShapeDecorator`) that implements the `Shape` interface and has a `Shape` object as its instance variable:
    ```java
    public abstract class ShapeDecorator implements Shape {
        protected Shape decoratedShape;

        public ShapeDecorator(Shape decoratedShape) {
            this.decoratedShape = decoratedShape;
        }

        public void draw() {
            decoratedShape.draw();
        }
    }
    ```

4. **Create a concrete decorator class** (`RedShapeDecorator`) extending `ShapeDecorator`:
    ```java
    public class RedShapeDecorator extends ShapeDecorator {
        public RedShapeDecorator(Shape decoratedShape) {
            super(decoratedShape);
        }

        @Override
        public void draw() {
            decoratedShape.draw();
            addRedBorder();
        }

        private void addRedBorder() {
            System.out.println("Border Color: Red");
        }
    }
    ```

5. **Use the decorator class** to decorate `Shape` objects:
    ```java
    public class DecoratorPatternDemo {
        public static void main(String[] args) {
            Shape circle = new Circle();
            Shape redCircle = new RedShapeDecorator(new Circle());
            Shape redRectangle = new RedShapeDecorator(new Rectangle());

            System.out.println("Circle with normal border:");
            circle.draw();

            System.out.println("\nCircle with red border:");
            redCircle.draw();

            System.out.println("\nRectangle with red border:");
            redRectangle.draw();
        }
    }
    ```
Remember, the Decorator pattern promotes flexibility, reusability, and composition over inheritance. It’s a powerful tool for enhancing objects without modifying their core behavior! 🌟🎨

This example demonstrates how the decorator pattern allows you to add new functionality (like the red border) to existing objects without altering their structure. Feel free to experiment and explore more complex scenarios! 🎨🌟

For further details, you can refer to the [GeeksforGeeks article](https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/) or the [Baeldung tutorial](https://www.baeldung.com/java-decorator-pattern).¹²

Source: Conversation with Bing, 16/05/2024
- (1) Decorator Method Design Patterns in Java with Example. https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/.
- (2) The Decorator Pattern in Java | Baeldung. https://www.baeldung.com/java-decorator-pattern.
- (3) Decorator Design Pattern in Java Example | DigitalOcean. https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example.
- (4) github.com. https://github.com/szhou1/InterviewQuestions/tree/587877a114ece1869f5637aa2b9b8029d2fe60c1/src%2Fdesign_patterns%2FDecoratorPattern.java.
- (5) github.com. https://github.com/Hexalolo/LearningDesignPatterns/tree/a4de641d8bae5317a1ed2fc54b6df55891e25ab6/src%2Fmain%2Fjava%2Fdecorator1%2FMain.java.
- (6) github.com. https://github.com/FernandoCalmet/Design-Patterns/tree/50d109f133b6ddb5754293d58317847f39bef45c/patternsjava%2Fdecorator%2FREADME.md.
- (7) github.com. https://github.com/XuShaoming/Programming_Language/tree/375892881ebda2fcc2f8992c32ae7f1cbb881038/Design_Pattern%2FDecoratorPattern%2FDecoratorPatternDemo.java.
- (8) github.com. https://github.com/marwit23/DesignPatterns/tree/841c1150e2889891d811e3436b17b52ca80d268e/src%2Fstructural%2Fdecorator%2FDecoratorMain.java.

## Behavioral Patterns