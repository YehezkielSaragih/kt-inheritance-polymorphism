import model.Animal
import model.Cat
import model.Dog

fun main() {

    // Polymorphism: variabel tipe model.Animal bisa menyimpan objek model.Dog atau model.Cat
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Kitty"),
        Cat("Kitty"),
        Animal("Generic animal")
    )

    // Polymorphism in action: method speak() dipanggil sesuai jenis object
    for (a in animals) {
        a.greet()
        a.speak()
    }

    println("===============================")

    println(animals[1])
    println(animals[2])
    println(animals[1].equals(animals[2]))

    println("===============================")


    for (a in animals){
        a.speak(2)
    }
}