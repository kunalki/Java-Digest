**Generic Constructors:**

A generic constructor can be defined in a generic class. However, the generic type parameter for the constructor may be different from the generic type parameter of the class:
```
class Test<T> {
private T value;

    // Generic constructor
    <U> Test(U input) {
        System.out.println(input.getClass().getName());
    }
}
public class Main {

public static void main(String[] args) {

Test<Integer> test = new Test<>(12.34);  // Output: java.lang.Double

}

}
```
In this case, the generic type parameter U is for the constructor only and is independent of the class type parameter T.

**Multiple Type Parameters in Constructors:**
```
class Pair {
// Generic constructor with two type parameters
<A, B> Pair(A first, B second) {
System.out.println("First: " + first + ", Second: " + second);
}
}

public class Main {
public static void main(String[] args) {
new Pair(10, "Ten");  // Integer and String
new Pair(3.14, 42);   // Double and Integer
}
}

```

Here, The constructor accepts two parameters, each of a different type A and B. The constructor prints out both values, showing how it can handle multiple type parameters.

**Bounded Type Parameters in Generic Constructors:**

You can also apply bounds to the type parameters in generic constructors, just like in generic classes or methods. Bounded type parameters restrict the types that can be used as arguments in the constructor.
```
class NumberPrinter {
// Bounded type parameter for generic constructor
<T extends Number> NumberPrinter(T number) {
System.out.println("Number: " + number);
}
}

public class Main {
public static void main(String[] args) {
new NumberPrinter(100);  // Integer is a subclass of Number
new NumberPrinter(3.14);  // Double is a subclass of Number

        // The following would cause a compile-time error because String is not a subclass of Number
        // new NumberPrinter("Hello");  
    }
}

```
In above example, the constructor is generic and accepts only arguments of types that are subclasses of Number, such as Integer, Double, Float, etc.
Trying to pass a type that does not extend Number (like String) results in a compilation error.

**Conclusion:**

Generic constructors in Java provide flexibility and reusability, especially in situations where you need to deal with different types during object creation. They allow you to separate the type logic of the class from the constructor and ensure that the appropriate type is inferred or specified at the time of object creation.

* In non-generic classes, generic constructors allow creating instances using any type.
* In generic classes, the generic constructor’s type parameter can be independent of the class’s type parameter.
* You can have multiple type parameters, bounded type parameters, and type inference to handle complex situations with type-safe constructor definitions.




