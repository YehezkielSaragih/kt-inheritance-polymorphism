# Kotlin OOP Example: Inheritance & Polymorphism

A simple project to demonstrate **Object-Oriented Programming (OOP)** concepts in Kotlin, covering:

- **Inheritance**
- **Polymorphism**
- **Method Overriding**
- **Method Overloading**
- **Default equals() behavior**

## 📂 Project Structure

```
src/
├── model/
│ ├── Animal.kt # Superclass dengan protected property + overloading
│ ├── Dog.kt # Subclass dari Animal (override speak)
│ └── Cat.kt # Subclass dari Animal (override speak)
└── Main.kt # Entry point program
```

## 📝 Explanation

### 🔹 `Animal.kt`
- Declared as `open class` so it can be inherited.
- `name` property is `protected` → accessible to subclasses but not from outside the class.
- `speak()` → default method.
- `speak(loop: Int)` → demonstrates **method overloading**.
- `greet()` → introduces the animal by name.

### 🔹 `Dog.kt` and `Cat.kt`
- Inherit from `Animal`.
- Override the `speak()` method → **method overriding**.
- Override `speak(loop: Int)` → add custom behavior with looped output.

### 🔹 `Main.kt`
- Creates a list of `Animal` containing `Dog`, `Cat`, and `Animal`.
- Demonstrates **polymorphism**: the `speak()` method runs based on the actual object type.
- Checks equality with default `equals()` (compares references, not values).
- Runs `speak(loop: Int)` to show **method overloading**.

## 👨‍💻 Authors

- Royzen Anggatama
- Rian Adriansyah
- Yehezkiel Stephanus Austin
