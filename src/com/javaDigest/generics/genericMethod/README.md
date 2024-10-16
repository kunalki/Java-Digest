**Generic Methods:**

Generic methods are methods that allow for type parameters, meaning they can be defined to accept different types of parameters in a type-safe way. By using generic methods, you can write code that works with any type and enforces compile-time type checking.

The syntax of a generic method is similar to that of a regular method, with the addition of type parameters declared in angle brackets (<>) before the return type. The type parameter can be any valid identifier but is often denoted by single capital letters like T, E, K, V, etc.

**Basic Syntax:**
```
public <T> void methodName(T parameter) {
// method body
}

```
Here:

* T is the type parameter.

* T can be any type such as Integer, String, Float, or any user-defined class.

**Example 1:**
```
public class GenericMethodExample {
// Generic method
public <T> void printArray(T[] array) {
for (T element : array) {
System.out.print(element + " ");
}
System.out.println();
}

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};
        
        // Using the generic method
        example.printArray(intArray);   // Output: 1 2 3 4 5
        example.printArray(stringArray); // Output: A B C D
    }
}

```

**Example 2:**

A generic method can also accept multiple type parameters. You can specify more than one type parameter by separating them with commas within the angle brackets.
```
public class GenericMethodExample {
public <T, U> void printTwoItems(T item1, U item2) {
System.out.println(item1 + " and " + item2);
}

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        
        example.printTwoItems(10, "Apples"); // Output: 10 and Apples
        example.printTwoItems("Hello", 3.14); // Output: Hello and 3.14
    }
}
```

**Example 3:**

Generic methods can also be defined in static context. Since static methods belong to the class, not to instances, the generic type parameter for a static method is defined at the method level, not at the class level.
```
public class GenericMethodExample {
// Generic static method
public static <T> void printElement(T element) {
System.out.println("Element: " + element);
}

    public static void main(String[] args) {
        GenericMethodExample.printElement(42); // Output: Element: 42
        GenericMethodExample.printElement("Generics in Java"); // Output: Element: Generics in Java
    }
}

```

**Example 4:**
Generic Methods and Method Overloading
```
public class GenericMethodExample {
public <T> void display(T element) {
System.out.println("Generic display: " + element);
}

    public void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        
        example.display(42);         // Calls the Integer display method
        example.display("Generics"); // Calls the generic display method
    }
}

```

In the above example, even though we have a generic method display, the non-generic display method that accepts an Integer gets called when we pass an integer value.

**Example 5:** Generic Methods and Varargs
```
public class GenericMethodExample {
public <T> void display(T element) {
System.out.println("Generic display: " + element);
}

    public void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();
        
        example.display(42);         // Calls the Integer display method
        example.display("Generics"); // Calls the generic display method
    }
}

```
