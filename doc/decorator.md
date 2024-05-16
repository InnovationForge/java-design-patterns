# Decorator Pattern
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

“Wrapper” is the alternative nickname for the Decorator pattern that clearly expresses the main idea of the pattern. A wrapper is an object that can be linked with some target object. The wrapper contains the same set of methods as the target and delegates to it all requests it receives. However, the wrapper may alter the result by doing something either before or after it passes the request to the target.

When does a simple wrapper become the real decorator? As I mentioned, the wrapper implements the same interface as the wrapped object. That’s why from the client’s perspective these objects are identical. Make the wrapper’s reference field accept any object that follows that interface. This will let you cover an object in multiple wrappers, adding the combined behavior of all the wrappers to it.

The **Decorator design pattern** allows you to dynamically add functionality and behavior to an object without affecting other existing objects within the same class. Here's a simple example in Java:

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

Certainly! The **Decorator design pattern** finds practical applications in various real-world scenarios. Let's explore a couple of examples:

1. **Coffee Shop Ordering System**:
    - Imagine you're building a coffee shop application where customers can order different types of coffees with additional toppings (like milk, whipped cream, or caramel).
    - Instead of creating separate classes for every possible combination of coffee and toppings, the Decorator pattern can be used.
    - Here's a simplified example:

    ```java
    // Base interface for coffee
    public interface Coffee {
        double getCost();
        String getDescription();
    }

    // Concrete implementation of Espresso
    public class Espresso implements Coffee {
        @Override
        public double getCost() {
            return 1.99;
        }

        @Override
        public String getDescription() {
            return "Espresso";
        }
    }

    // Abstract decorator class
    public abstract class CoffeeDecorator implements Coffee {
        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }
    }

    // Concrete decorator for adding milk
    public class Milk extends CoffeeDecorator {
        public Milk(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double getCost() {
            return coffee.getCost() + 0.50;
        }

        @Override
        public String getDescription() {
            return coffee.getDescription() + ", Milk";
        }
    }

    // Usage
    Coffee myCoffee = new Milk(new Espresso());
    System.out.println("Description: " + myCoffee.getDescription());
    System.out.println("Cost: $" + myCoffee.getCost());
    ```

    - In this example, we dynamically add toppings (like milk) to a base coffee object using decorators. The `Milk` decorator extends the functionality without altering the original structure of the coffee.

2. **Vending Machine**:
    - Consider a vending machine that dispenses different types of beverages (tea, coffee, etc.).
    - Each beverage can have additional ingredients (like sugar, lemon, or cream).
    - The Decorator pattern allows us to add these ingredients dynamically.
    - Here's a simplified example:

    ```java
    // Base interface for beverages
    public interface Beverage {
        void decorateBeverage();
    }

    // Concrete beverage: Tea
    public class Tea implements Beverage {
        private String name;

        public Tea(String name) {
            this.name = name;
        }

        @Override
        public void decorateBeverage() {
            System.out.println("Preparing " + name);
        }
    }

    // Decorator for adding sugar
    public class SugarDecorator implements Beverage {
        private Beverage beverage;

        public SugarDecorator(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public void decorateBeverage() {
            beverage.decorateBeverage();
            System.out.println("Adding sugar");
        }
    }

    // Decorator for adding lemon
    public class LemonDecorator implements Beverage {
        private Beverage beverage;

        public LemonDecorator(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public void decorateBeverage() {
            beverage.decorateBeverage();
            System.out.println("Adding lemon");
        }
    }

    // Usage
    Beverage teaWithSugarAndLemon = new SugarDecorator(new LemonDecorator(new Tea("Assam Tea")));
    teaWithSugarAndLemon.decorateBeverage();
    ```

    - In this example, we decorate a base tea object with sugar and lemon using decorators. The order of decoration matters, and each decorator adds a specific ingredient.

Remember, the Decorator pattern promotes flexibility, reusability, and composition over inheritance. It's a powerful tool for enhancing objects without modifying their core behavior! 🌟🎨

For more real-world examples, you can explore [other use cases](https://www.pentalog.com/blog/design-patterns/decorator-design-pattern/).⁴

Source: Conversation with Bing, 16/05/2024
- (1) The Art of Decorating: Applying the Decorator Design Pattern in Real Life. https://www.pentalog.com/blog/design-patterns/decorator-design-pattern/.
- (2) Decorator Pattern in Real World | CodingDrills. https://www.codingdrills.com/tutorial/design-patterns-tutorial/decorator-pattern-real-world.
- (3) Decorator Design Pattern - Scaler Topics. https://www.scaler.com/topics/design-patterns/decorator-design-pattern/.
- (4) Understand the "Decorator Pattern" with a real world example. https://stackoverflow.com/questions/2707401/understand-the-decorator-pattern-with-a-real-world-example.
