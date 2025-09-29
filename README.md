# Kotlin OOP Example: Inheritance & Polymorphism

This project is a simple example of **Object-Oriented Programming (OOP)** in Kotlin, demonstrating **inheritance** and **polymorphism** using `Animal`, `Dog`, and `Cat` classes.

## 📂 Project Structure

```
src/
├── Animal.kt # Base class (superclass)
├── Dog.kt # Subclass of Animal
├── Cat.kt # Subclass of Animal
└── Main.kt # Entry point of the program
```

## 📝 Explanation

- **`Animal`**  
  Base class, marked as `open` so it can be inherited.  
  Has a function `speak()` that can be overridden.

- **`Dog`**  
  Inherits from `Animal` and overrides the `speak()` function.

- **`Cat`**  
  Also inherits from `Animal` and overrides the `speak()` function.

- **`Main`**  
  Creates a list of animals (`Dog`, `Cat`, `Animal`) and demonstrates polymorphism:  
  each object calls its own `speak()` implementation.

## 🔎 Example Output

Buddy barks: Woof woof!
Kitty meows: Meow~
Generic Animal makes a sound

## 📚 Concepts Shown

- Inheritance → Dog and Cat extend Animal.
- Polymorphism → Animal type can hold different object types, but method calls behave according to the actual object instance.
- Override → speak() is overridden in subclasses to provide different behaviors.

## 👨‍💻 Authors

- Royzen Anggatama
- Rian Adriansyah
- Yehezkiel Stephanus Austin
