import model.Animal
import model.Cat
import model.Dog

fun main() {

    // Polymorphism: a variable of type Animal can hold Dog or Cat objects
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Kitty"),
        Cat("Kitty"),
        Animal("Generic animal")
    )

    // Polymorphism in action: the speak() method is called
    // according to the actual object type at runtime
    for (a in animals) {
        a.greet()
        a.speak()
    }

    println("===============================")

    // Demonstrating method overloading
    // Calls speak(Int) which repeats the speak() behavior
    for (a in animals){
        a.speak(2)
    }

    println("===============================")

    // Demonstrating default toString() and equals() behavior from Any
    // By default, toString() prints class name + memory reference
    // and equals() compares references (not values)
    println(animals[1])
    println(animals[2])
    println(animals[1].equals(animals[2]))
}
