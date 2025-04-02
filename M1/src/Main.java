package org.example;


public class Main {
    public static void main(String[] args) {

        // 8 Primitive Types - int, char, short, byte, long, float, double, boolean : Stores data in a Stack;
        // Corresponding Reference types (Wrapper) - Integer, Character, Long, . . . .

        // Need for Reference Types - 1. When you want to pass variables by reference to another function;
        //                            2. Collections in Java work on Reference data types only;

        // More Non-primitive (Reference) Data Types
        // 1. Sting  2. Interface  3. Class  4. Array

        String str;  // immutable in Java

        String s1 = "hello";  // "hello" is created as a string literal; stored in String Constant Pool (present inside Heap);

        String s2 = "hello"; // Since "hello" is already present in String Const Pool, it will point to same memory as s1;

        String s3 = new String("hello"); // Creates a new object of "hello" inside heap;

        if(s1 == s3) System.out.println("Same memory");
        else System.out.println("Different Memory");

        if(s1.equals(s3)) System.out.println("Same content inside both Strings");
        else System.out.println("Different content");

        // Method Overloading - Same method names, different arguments (return type doesn't matter)
        //                    - Static binding, Compile-time Polymorphism

        // Method Overriding - Subclass has EXACT same method as Parent Class;
        //                   - Dynamic Binding, Run-time Polymorphism;

        // Static Methods - Method is associated with a Class, rather than an Object; Can be called with ClassName.method() instead of Obj.method()
        //                - Cannot access non-static instance variables and methods within that class;
        //                - Cannot be overridden;
        // When to use: - Utility methods which only work on method arguments;
        //              - Methods which do not modify state of the object; EXAMPLE: Factory Design Pattern;

        // Final Method - cannot be overridden; Child class cannot change its implementation;
    }
}
